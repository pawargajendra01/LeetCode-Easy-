class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(s);

        for(int i=0;i<indices.length;i++){
            sb.setCharAt(indices[i],sb2.charAt(i));
        }
        return sb.toString();
    }
}