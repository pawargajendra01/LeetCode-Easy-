class Solution {
    public int specialArray(int[] nums) {
        int[] count = new int[101];
        
        for (int num : nums) {
            if (num >= 100) {
                count[100]++;
            } else {
                count[num]++;
            }
        }
        
        int totalGreaterOrEqual = 0;
        for (int x = 100; x >= 0; x--) {
            totalGreaterOrEqual += count[x];
            if (totalGreaterOrEqual == x) {
                return x;
            }
        }
        
        return -1;
    }
}