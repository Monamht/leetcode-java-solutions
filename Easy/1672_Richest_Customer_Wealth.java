// LeetCode 1672 - Richest Customer Wealth
// Difficulty: Easy
// Time Complexity: O(n * m)
// Space Complexity: O(1)
// Approach: Sum each customer's wealth and track the maximum.

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int[] person : accounts) {
            int sum = 0;
            for (int money : person) {
                sum += money;
            }
            max = Math.max(max, sum);
        }

        return max;
    }
}
