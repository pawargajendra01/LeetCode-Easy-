class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morsecodes = {".-","-...","-.-.","-..",".","..-.","--.",
                                   "....","..",".---","-.-",".-..","--","-.",
                                   "---",".--.","--.-",".-.","...","-","..-",
                                   "...-",".--","-..-","-.--","--.."
        };

        HashSet<String> set = new HashSet<>();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<words.length;i++){
            sb.setLength(0);
            for(int j=0;j<words[i].length();j++){
                sb.append(morsecodes[words[i].charAt(j) - 97]);
            }
            set.add(sb.toString());
        }

        return set.size();
    }
}