class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            sum+=mat[i][mat.length-(i+1)];
        }
        int num=mat.length/2;
        if(mat.length%2==1)sum-=mat[num][num];
        return sum;
    }
}