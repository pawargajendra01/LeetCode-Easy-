class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1){
            return n;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<trust.length;i++){
            map.put(trust[i][1],map.getOrDefault(trust[i][1],0)+1);
            set.add(trust[i][0]);
        }
        if(set.size()> n-1){
            return -1;
        }
        for(int i=1;i<=n;i++){
            if(map.containsKey(i)){
                if(map.get(i)>=n-1){
                    return i;
                }
            }     
        }
        return -1;
    }
}