class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int[] row = new int[m];
        int[] column = new int[n];

        for (int i = 0; i < indices.length;i++) {
            row[indices[i][0]]++;
            column[indices[i][1]]++;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=row[i]+column[j];
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}