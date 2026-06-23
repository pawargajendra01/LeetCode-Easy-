class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] line = new int[52];
        
        for (int[] range : ranges) {
            line[range[0]]++;
            line[range[1] + 1]--;
        }
        
        int currentOverlap = 0;
        for (int i = 1; i <= right; i++) {
            currentOverlap += line[i];
            if (i >= left && currentOverlap <= 0) {
                return false;
            }
        }
        
        return true;
    }
}