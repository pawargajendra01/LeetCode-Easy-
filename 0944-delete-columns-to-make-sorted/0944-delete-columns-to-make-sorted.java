/*class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        for(int i=0;i<strs[0].length();i++){
            for(int j=0;j<strs.length-1;j++){
                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}*/
class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int rowCount = strs.length;
        int colCount = strs[0].length();
        
        for (int i = 0; i < colCount; i++) {
            // Optimization: Start with the first character and compare downward
            for (int j = 1; j < rowCount; j++) {
                if (strs[j].charAt(i) < strs[j-1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}