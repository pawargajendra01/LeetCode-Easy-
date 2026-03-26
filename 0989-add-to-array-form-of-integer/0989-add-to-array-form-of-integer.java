import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder sb =new StringBuilder();
        
        for(int i=0;i<num.length;i++){
            sb.append(num[i]);
        }
        ArrayList<Integer> list= new ArrayList<>();
        BigInteger number = new BigInteger(sb.toString()).add(BigInteger.valueOf(k));
        while(number.compareTo(BigInteger.ZERO)>0){
            BigInteger digitBI = number.remainder(BigInteger.valueOf(10));
            list.add(digitBI.intValue());
            number = number.divide(BigInteger.valueOf(10));
        }
        Collections.reverse(list);
        return list;
    }
}