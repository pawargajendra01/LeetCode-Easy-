class Solution {
    public int maxProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>second){
                second=nums[i];
                if(second>first){
                    int temp = first;
                    first = second;
                    second = temp;
                }
            }
        }
        return (second-1)*(first-1);
    }
}