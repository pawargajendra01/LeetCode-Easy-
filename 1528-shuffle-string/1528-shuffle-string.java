class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);

        for(int i=0;i<indices.length;i++){
            sb.setCharAt(indices[i],s.charAt(i));
        }
        return sb.toString();
    }
}