// LeetCode 1672 - Richest Customer Wealth
// Difficulty: Easy
// Time Complexity: O(n * m)
// Space Complexity: O(1)
// Approach: Sum each customer's wealth and track the maximum.

// Biginner friendly approach
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

/*Approach 2: Using Integer.MIN_VALUE

int ans = Integer.MIN_VALUE;
for (int person = 0; person < accounts.length; person++) {
    int sum = 0;
    for (int account = 0; account < accounts[person].length; account++) {
        sum += accounts[person][account];
    }
    if (sum > ans) {
        ans = sum;
    }
}*/
