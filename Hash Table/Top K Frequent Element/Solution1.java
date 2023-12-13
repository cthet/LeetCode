// Heap

// Time complexity : O(Nlog⁡k) if k<N and O(N) in the particular case of N=k.
// That ensures time complexity to be better than O(Nlog⁡N)

//Space complexity : O(N+k) to store the hash map with not more
//N elements and a heap with k elements.

import java.util.*;

class Solution {
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

        // init heap 'the less frequent element first'
        Queue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> frequencyMap.get(n1) - frequencyMap.get(n2));

        // 2. keep k top frequent elements in the heap
        // O(N log k) < O(N log N) time
        for (int n: frequencyMap.keySet()) {
          heap.add(n);
          if (heap.size() > k) heap.poll();    
        }

        // 3. build an output array
        // O(k log k) time
        int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }
        return top;
    }
}