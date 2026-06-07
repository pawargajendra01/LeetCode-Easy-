import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        
        int maxUnits = 0;
        
        for (int[] box : boxTypes) {
            int numberOfBoxes = box[0];
            int unitsPerBox = box[1];
            
            if (truckSize >= numberOfBoxes) {
                maxUnits += numberOfBoxes * unitsPerBox;
                truckSize -= numberOfBoxes;
            } else {
                maxUnits += truckSize * unitsPerBox;
                break;
            }
        }
        
        return maxUnits;
    }
}