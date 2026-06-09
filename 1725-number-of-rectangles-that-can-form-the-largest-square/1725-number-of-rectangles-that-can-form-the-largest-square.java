class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen=Integer.MIN_VALUE;
        for(int i=0;i<rectangles.length;i++){
            if(Math.min(rectangles[i][0],rectangles[i][1])>=maxLen){
                maxLen = Math.min(rectangles[i][0],rectangles[i][1]);
            }
        }
        int count=0;
        for(int i=0;i<rectangles.length;i++){
            if(Math.min(rectangles[i][0],rectangles[i][1])==maxLen){
                count++;
            }
        }
        return count;
    }
}