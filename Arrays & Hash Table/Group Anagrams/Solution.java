// Time complexity: O(n * klogk)
//  Sorting each word takes O(klogk) time, where k is the maximum length of a word in strs.
//  We do this for all n words, so the total time complexity is O(n * klogk).

// Space complexity: O(n) We are storing all words in the hashmap.

import java.util.*;

public class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    if (strs == null || strs.length == 0) {
        return new ArrayList<>();
    }

    Map<String, List<String>> map = new HashMap<>();
    for (String s : strs) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String key = String.valueOf(charArray);
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(s);
    }
    return new ArrayList<>(map.values());
}
}
