class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Arrays.sort(nums);
        int num =0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                result[0] = nums[i];
                num = i;
                break;
            }
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]+1!=nums[i+1]&& i!=num ) {
                result[1] = nums[i]+1;
                break;
            }
        }
        if(nums[0]!=1){
            result[1]=1;
        }
        if(nums[nums.length-1]!=nums.length){
            result[1]=nums.length;
        }

        return result;
    }
}