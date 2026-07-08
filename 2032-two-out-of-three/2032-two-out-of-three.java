import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] counts = new int[101];
        
        boolean[] present1 = new boolean[101];
        for (int num : nums1) {
            if (!present1[num]) {
                present1[num] = true;
                counts[num]++;
            }
        }
        
        boolean[] present2 = new boolean[101];
        for (int num : nums2) {
            if (!present2[num]) {
                present2[num] = true;
                counts[num]++;
            }
        }
        
        boolean[] present3 = new boolean[101];
        for (int num : nums3) {
            if (!present3[num]) {
                present3[num] = true;
                counts[num]++;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (counts[i] >= 2) {
                result.add(i);
            }
        }
        
        return result;
    }
}