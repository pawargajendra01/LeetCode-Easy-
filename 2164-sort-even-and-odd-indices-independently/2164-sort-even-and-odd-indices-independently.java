class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] evenCount = new int[101];
        int[] oddCount = new int[101];

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenCount[nums[i]]++;
            } else {
                oddCount[nums[i]]++;
            }
        }

        int evenVal = 1;
        for (int i = 0; i < nums.length; i += 2) {
            while (evenCount[evenVal] == 0) {
                evenVal++;
            }
            nums[i] = evenVal;
            evenCount[evenVal]--;
        }

        int oddVal = 100;
        for (int i = 1; i < nums.length; i += 2) {
            while (oddCount[oddVal] == 0) {
                oddVal--;
            }
            nums[i] = oddVal;
            oddCount[oddVal]--;
        }

        return nums;
    }
}