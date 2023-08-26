import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        for (int i = 0; i < numbers.length - 1; i++) {
            int complement = target - numbers[i];
            int pos = Arrays.binarySearch(numbers, i + 1, numbers.length, complement);
            if (pos > i) {
                return new int[] {i + 1, pos + 1};
            }
       
        }
        return null;
    }
}