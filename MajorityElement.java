public static int majorityElement2(int[] nums){
    if(nums.length==1||nums.length==2)
        return nums[0];
    int count=1;
    int el=nums[0];//majority elment
    for(int i=1;i<nums.length;i++){
        if(nums[i]==el) count++;
        else count--;
        if(count<0){ el=nums[i];
                count=1;
    }

}
    return el;
}