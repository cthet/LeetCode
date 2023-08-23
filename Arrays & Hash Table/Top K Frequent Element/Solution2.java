// Time complexity: O(n) : HashMap creation + Buckets creation + Result creation = O(n)+O(n)+O(n)=O(n);
// Space complexity: O(n) : frequencyMap -> O(n) in worst case (all elements are unique). buckets: O(n)

import java.util.*;

public class Solution2 {
  public int[] topKFrequent(int[] nums, int k) {
      // O(1) time
        if (k == nums.length) {
          return nums;
      }
              
      // 1. build hash map : character and how often it appears
      // O(N) time
      HashMap<Integer, Integer> frequencyMap = new HashMap<>();

      for(int i: nums){
          frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
      }
    
    // Utilisez le bucket sort: initiez un tableau de listes pour stocker les numéros qui ont la même fréquence.
    List<Integer>[] buckets = new List[nums.length + 1];
    for (int key : frequencyMap.keySet()) {
        int frequency = frequencyMap.get(key);
        if (buckets[frequency] == null) {
            buckets[frequency] = new ArrayList<>();
        }
        buckets[frequency].add(key);
    }
    
    // Récupérez les k éléments les plus fréquents.
    List<Integer> resList = new ArrayList<>();
    for (int pos = buckets.length - 1; pos >= 0 && resList.size() < k; pos--) {
        if (buckets[pos] != null) {
            resList.addAll(buckets[pos]);
        }
    }
    
    // Convertissez la liste en tableau
    int[] res = new int[resList.size()];
    for (int i = 0; i < resList.size(); i++) {
        res[i] = resList.get(i);
    }
    
    return res;
  }
}
