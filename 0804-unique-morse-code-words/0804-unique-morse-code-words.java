class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morsecodes = {".-","-...","-.-.","-..",".","..-.","--.",
                                   "....","..",".---","-.-",".-..","--","-.",
                                   "---",".--.","--.-",".-.","...","-","..-",
                                   "...-",".--","-..-","-.--","--.."
        };

        HashSet<String> set = new HashSet<>();

        for(int i=0;i<words.length;i++){
            String word = "";
            for(int j=0;j<words[i].length();j++){
                word += morsecodes[words[i].charAt(j) - 97];
            }
            set.add(word);
        }

        return set.size();
    }
}