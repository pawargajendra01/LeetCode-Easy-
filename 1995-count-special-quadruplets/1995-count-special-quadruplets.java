import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int b = n - 3; b >= 1; b--) {
            int c = b + 1;
            for (int d = c + 1; d < n; d++) {
                int diff = nums[d] - nums[c];
                map.put(diff, map.getOrDefault(diff, 0) + 1);
            }
            for (int a = 0; a < b; a++) {
                int targetSum = nums[a] + nums[b];
                count += map.getOrDefault(targetSum, 0);
            }
        }
        
        return count;
    }
}