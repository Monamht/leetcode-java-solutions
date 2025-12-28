// LeetCode 1295 - Find Numbers with Even Number of Digits
// Difficulty: Easy
// Time Complexity: O(n * d) where d = number of digits
// Space Complexity: O(1)

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;

            while (num > 0) {
                digits++;
                num /= 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
/*
------------------------------------------------------------
Alternative Optimized Approach (Using Math.log10)
------------------------------------------------------------

Idea:
Number of digits in a positive number n = floor(log10(n)) + 1
This avoids looping through digits.

Code:

int digits = (int) Math.log10(num) + 1;

Example:
num = 7896
log10(7896) ≈ 3.89 → floor(3.89) = 3 → +1 = 4 digits

Time Complexity: O(n)
Space Complexity: O(1)

Note:
This works only when num > 0.
LeetCode guarantees nums[i] >= 1, so it is safe.
*/
