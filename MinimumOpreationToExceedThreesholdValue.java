class Solution {
    public int minOperations(int[] nums, int k) {
        int op=0;
        PriorityQueue<Long> pq=new PriorityQueue<>();
       for(int el:nums)
       {
            if(el<k) pq.add((long)el);
       }
       while(!pq.isEmpty())
       {
           long val=pq.poll();
           if(val>=k) break;
           op++;
           if(pq.isEmpty()) break;
           pq.add(val*2+pq.poll());
       }
       return op;
    }
}