// Time: O(n)
// Space: O(n)

import java.util.HashMap;

class Solution {
  
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                int index1 = map.get(complement);
                int index2 = i;
                return new int[] { index1, index2 };
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException();
    }
    
}