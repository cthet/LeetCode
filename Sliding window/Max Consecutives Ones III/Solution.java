// Time complexity: O(n)

// Space complexity: O(1)

public class Solution {
  public int longestOnes(int[] nums, int k) {
    int curr = 0;
    int nbZero = 0;
    int left = 0;
    int right = 0;
    int res = 0;
    
    for(int i=0;i<nums.length;i++){
        if(nums[right]==0){
            nbZero++;
        }
                        
        while(nbZero>k){
            if(nums[left] == 0) {
                nbZero--;
            }
            left++;
        }
        
        res = Math.max(res, right-left+1);
        right++;
    }
    return res;
    
  }
}