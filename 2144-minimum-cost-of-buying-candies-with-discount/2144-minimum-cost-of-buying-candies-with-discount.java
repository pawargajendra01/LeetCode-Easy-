class Solution {
    public int minimumCost(int[] cost) {
        int sum=0;
        Arrays.sort(cost);

        int num=1;
        for(int i=cost.length-1;i>=0;i--){
            if(num>2){
                num=1;
            }
            else{
                sum+=cost[i];
                num++;
            }
        }    
        return sum;
    }
}