import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] counts = new int[10];
        for (int digit : digits) {
            counts[digit]++;
        }
        
        List<Integer> resultList = new ArrayList<>();
        
        for (int i = 100; i <= 998; i += 2) {
            int d1 = i / 100;
            int d2 = (i / 10) % 10;
            int d3 = i % 10;
            
            counts[d1]--;
            counts[d2]--;
            counts[d3]--;
            
            if (counts[d1] >= 0 && counts[d2] >= 0 && counts[d3] >= 0) {
                resultList.add(i);
            }
            
            counts[d1]++;
            counts[d2]++;
            counts[d3]++;
        }
        
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}