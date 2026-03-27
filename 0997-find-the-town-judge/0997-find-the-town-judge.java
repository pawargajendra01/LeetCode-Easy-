class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] scores = new int[n + 1];
        
        for (int[] t : trust) {
            scores[t[0]]--; // Trusts someone? Lose a point.
            scores[t[1]]++; // Is trusted? Gain a point.
        }
        
        for (int i = 1; i <= n; i++) {
            // Only the judge can have exactly n-1 points
            if (scores[i] == n - 1) return i;
        }
        
        return -1;
    }
}