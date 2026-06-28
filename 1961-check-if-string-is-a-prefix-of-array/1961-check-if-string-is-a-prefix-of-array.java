class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder currentString = new StringBuilder();
        
        for (String word : words) {
            currentString.append(word);
            
            if (currentString.toString().equals(s)) {
                return true;
            }
            
            if (currentString.length() > s.length()) {
                return false;
            }
        }
        
        return false;
    }
}