class Solution {
    public int sumOfUnique(int[] nums) {
        if (nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean leftDuplicate = (i > 0) && (nums[i] == nums[i - 1]);
            boolean rightDuplicate = (i < n - 1) && (nums[i] == nums[i + 1]);
            if (!leftDuplicate && !rightDuplicate) {
                sum += nums[i];
            }
        }
        return sum;
    }
}