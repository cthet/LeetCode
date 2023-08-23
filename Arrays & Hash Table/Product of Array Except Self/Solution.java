// Time complexity: O(n)
// Space complexity: O(1) pre and post are O(1) 
//(res is of space O(n) but is considered as the output space)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int pre = 1, post = 1;

        for(int i = 0; i < nums.length;i++) {
            res[i] = pre;
            pre*=nums[i];
        }

        for(int i = nums.length - 1; i >= 0;i--) {
            res[i] *= post;
            post*=nums[i];
        }

        return res;
    }
}
