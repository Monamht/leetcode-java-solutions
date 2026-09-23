/**

716. Check if an Array Is Consecutive

Given an integer array nums, return true if nums is consecutive, otherwise return false.
An array is consecutive if it contains every number in the range [x, x + n - 1] (inclusive), 
where x is the minimum number in the array and n is the length of the array.

Example 1:
Input: nums = [1,3,4,2]
Output: true
Explanation:
The minimum value is 1 and the length of nums is 4.
All of the values in the range [x, x + n - 1] = [1, 1 + 4 - 1] = [1, 4] = (1, 2, 3, 4) occur in nums.
Therefore, nums is consecutive. 
**/

class Solution {

    public boolean isConsecutive(int[] nums) {

        int n = nums.length;

        int min = nums[0];
        int max = nums[0];

        // Find minimum and maximum
        for (int i = 1; i < n; i++) {

            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Range must contain exactly n numbers
        if (max - min + 1 != n) {
            return false;
        }

        // Check duplicates
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (nums[i] == nums[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
