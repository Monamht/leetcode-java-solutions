/**
Find missing number
Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.
Example 1:
Input: nums = [0, 2, 3, 1, 4]
Output: 5
Explanation:
nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]

Example 2:
Input: nums = [0, 1, 2, 4, 5, 6]
Output: 3
Explanation:
nums contains 0, 1, 2, 4, 5, 6 thus leaving 3 as the only missing number in the range [0, 6]
TIME COMPLEXITY :- O(N^2)
SPACE COMPLEXITY :- O(1)
**/

class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        for (int i = 0; i <= n; i++) {

            boolean found = false;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                return i;
            }
        }

        return -1;
    }
}
