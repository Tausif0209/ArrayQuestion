import java.util.List;

class Solution {
    public int minimumIndex(List<Integer> nums) {
        int majority=majorityVote(nums);
        int len=nums.size(),i;
        int[] count=new int[len];
        count[0]=(nums.get(0)==majority)?1:0;
        for(i=1;i<len;i++){
            count[i]=(nums.get(i)==majority)?count[i-1]+1:count[i-1];
        }
        for(i=0;i<len-1;i++){
          if(count[i]>((i+1)/2) && count[len-1]-count[i]>(len-i-1)/2)
           return i;
        }
        return -1;
    }
    private int majorityVote(List<Integer> nums){
        int count=1;
        int majority=nums.get(0),len=nums.size();
        for(int i=1;i<len;i++){
            int val=nums.get(i);
            if(val==majority) count++;
            else count--;
            if(count<0){
                majority=val;
                count=1;
            }
        }
        return majority;
    }
}