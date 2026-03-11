class Solution {
    public int[] numberOfLines(int[] widths, String s) {

        int[] arr = new int[2];
        int total=0;
        int count=1;

        for(int i=0;i<s.length();i++){
            total+= widths[s.charAt(i) - 'a'];
            if(total>100){
                total-=widths[s.charAt(i) - 'a'];
                total=0;
                total+= widths[s.charAt(i) - 'a'];
                count++;
            }
        }
        arr[0]=count;
        arr[1]=total;

        return arr;
    }
}