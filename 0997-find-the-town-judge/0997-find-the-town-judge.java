class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1){
            return 1;
        }

        int indegree[] = new int[n+1];
        int outdegree[] = new int[n+1];

        for(int[] t:trust){
            outdegree[t[0]]++;
            indegree[t[1]]++;
        }

        for(int i=0;i<n+1;i++){
            if(indegree[i]==n-1 && outdegree[i]==0){
                return i;
            }
        }
        return -1;
    }
}