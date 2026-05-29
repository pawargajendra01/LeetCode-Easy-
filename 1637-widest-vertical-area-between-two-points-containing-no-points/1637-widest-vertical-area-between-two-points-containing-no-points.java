import java.util.Arrays;

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xCoords = new int[points.length];
        
        for (int i = 0; i < points.length; i++) {
            xCoords[i] = points[i][0];
        }
        
        Arrays.sort(xCoords);
        
        int maxWidth = 0;
        for (int i = 1; i < xCoords.length; i++) {
            int width = xCoords[i] - xCoords[i - 1];
            if (width > maxWidth) {
                maxWidth = width;
            }
        }
        
        return maxWidth;
    }
}