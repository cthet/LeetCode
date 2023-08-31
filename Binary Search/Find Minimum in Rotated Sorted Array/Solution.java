// Time complexity: O(log(n))

// Space complexity: O(1)

class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            if(nums[left] <= nums[right]) {
                return nums[left];
            }

            int mid = (left + right) /2;

            if(nums[mid]>=nums[left]){
                left = mid + 1;                
            } else {
                right = mid;
            }
        }
        return 0;
    }
}