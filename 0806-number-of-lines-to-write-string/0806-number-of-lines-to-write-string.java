class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int currentLineWidth = 0;

        for (char c : s.toCharArray()) {
            int w = widths[c - 'a'];
            if (currentLineWidth + w > 100) {
                lines++;
                currentLineWidth = w;
            } else {
                currentLineWidth += w;
            }
        }

        return new int[]{lines, currentLineWidth};
    }
}