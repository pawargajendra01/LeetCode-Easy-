class Solution {
    public String restoreString(String s, int[] indices) {
        String str = ""; 
        HashMap<Integer,Character> map = new HashMap<>();
        
        for(int i=0;i<indices.length;i++){
            map.put(indices[i],s.charAt(i));
        }
        for(int i=0;i<indices.length;i++){
            str+=map.get(i);
        }
        return str;
    }
}