class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = Integer.MAX_VALUE;
        int solution = target;

        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1,k=nums.length-1;j<k;){
                if(nums[i]+nums[j]+nums[k] == target){
                    return target;
                }
                int temp = Math.abs( (nums[i]+nums[j]+nums[k]) - target);
                if(temp < sum){
                    sum = temp;
                    solution = nums[i]+nums[j]+nums[k];
                }
                if(nums[i]+nums[j]+nums[k]<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return solution;
    }
}