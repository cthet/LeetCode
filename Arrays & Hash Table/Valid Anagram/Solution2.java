// Time: O(n)
// Space: O(n)

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();

        for(int i=0; i<s.length();i++){
          countS.put(arrayS[i], countS.getOrDefault(arrayS[i], 0) +1);
          countT.put(arrayT[i], countT.getOrDefault(arrayT[i], 0) +1);
        }

        for(char c: arrayS){
          if(!countS.get(c).equals(countT.get(c))) {
                return false;
            }
        }
        return true;
    }
}