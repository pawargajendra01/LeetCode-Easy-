class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int temp = Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<points.length;i++){
            int x2=points[i][0];
            int y2=points[i][1];
            if(x==x2 || y==y2){
               int dist = Math.abs(x - x2) + Math.abs(y - y2);
                if(dist<temp){
                    temp=dist;
                    index=i;
                }
            }
        }
        return index;
    }
}