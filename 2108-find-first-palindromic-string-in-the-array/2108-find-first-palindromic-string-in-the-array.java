class Solution {
    public String firstPalindrome(String[] words) {
        for(String str:words){
            if(palindromeChecker(str))return str; 
        }
        return "";
    }
    public Boolean palindromeChecker(String str){
        for(int i =0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}