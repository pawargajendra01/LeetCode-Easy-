class Solution {
    public int minimumCost(int[] cost) {
        int sum=0;
        for(int i:cost){
            sum+=i;
        }    
        if(cost.length<3)return sum;

        Arrays.sort(cost);
        for(int i=cost.length-3;i>=0;i-=3){
            sum-=cost[i];
        }
        return sum;
    }
}