class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int sum= 0;
        int i = num.length-1;
        List<Integer>  result = new ArrayList<>();
        while (i >= 0 || k >0 || sum>=1) {
            if(i >=0){
                sum+= num[i];
                i--;
            } if(k >0){
                sum+= k%10;
                k/=10;
            }
            result.add(sum%10);
            sum/=10;
        }
       return result.reversed();

    }
}