class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing=true;
        boolean decreasing=true;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1] && increasing){
                increasing = true;
                decreasing = false;
            }
            else if(nums[i]>nums[i+1] && decreasing){
                increasing = false;
                decreasing = true;
            }
            else if(nums[i]==nums[i+1]){
                
            }
            else{
                return false;
            }
        }
        return true;
    }
}