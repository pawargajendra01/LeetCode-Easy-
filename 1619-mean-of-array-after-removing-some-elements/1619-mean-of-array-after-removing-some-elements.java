import java.util.Arrays;

class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        
        int removeCount = n / 20; 
        
        int sum = 0;
        for (int i = removeCount; i < n - removeCount; i++) {
            sum += arr[i];
        }
        
        int remainingElements = n - (2 * removeCount);
        return (double) sum / remainingElements;
    }
}