# Easy Level Problems

---

## 1672. Richest Customer Wealth

### Problem
Given a 2D array `accounts` where each row represents a customer and each column represents money in a bank, return the maximum wealth among all customers.

---

## Approach 1: Using Integer.MIN_VALUE

```java
int ans = Integer.MIN_VALUE;

for (int person = 0; person < accounts.length; person++) {
    int sum = 0;
    for (int account = 0; account < accounts[person].length; account++) {
        sum += accounts[person][account];
    }
    if (sum > ans) {
        ans = sum;
    }
}
