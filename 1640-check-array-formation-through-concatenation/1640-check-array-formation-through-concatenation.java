class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int[] indexMap = new int[101];
        java.util.Arrays.fill(indexMap, -1);
        
        for (int i = 0; i < pieces.length; i++) {
            indexMap[pieces[i][0]] = i;
        }
        
        int i = 0;
        while (i < arr.length) {
            int pieceIdx = indexMap[arr[i]];
            if (pieceIdx == -1) {
                return false;
            }
            
            for (int val : pieces[pieceIdx]) {
                if (i >= arr.length || arr[i] != val) {
                    return false;
                }
                i++;
            }
        }
        
        return true;
    }
}