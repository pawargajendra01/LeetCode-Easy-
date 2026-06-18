class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        int temp=nums[0];
        if(nums.length==1)return 0;

        for(int i=1;i<nums.length;i++){
            int diff=temp-nums[i];
            if(diff==0){
                count+=1;
                temp++;
            }
            else if(diff>0){
                count+=diff+1;
                temp=nums[i]+diff+1;
            }
            else{
                temp=nums[i];
            }
        }
        return count;
    }
}