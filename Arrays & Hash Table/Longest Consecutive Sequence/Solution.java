// Time complexity: O(n): O(n) + O(n);

// Space complexity: O(n)

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1)
        return nums.length;

        HashSet<Integer> numSet = new HashSet<>();
        int longest = 0;

        for(int n: nums){
            numSet.add(n);
        }

        for(int n : nums){

            if(!numSet.contains(n-1)){
            int length = 0;            

            while(numSet.contains(n + length)){
                length++;                
            }
            longest = Math.max(length, longest);
            }
            
        }
        return longest;


    }
}