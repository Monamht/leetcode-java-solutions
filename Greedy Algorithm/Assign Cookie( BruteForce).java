/**
Assign Cookies — Brute Force

Problem Statement
You are given two integer arrays:
- g[i] represents the greed factor of the i-th child.
- s[j] represents the size of the j-th cookie.
Each child can receive at most one cookie, and each cookie can be given to at most one child.
A child will be satisfied if:
cookie size >= child's greed factor

Return the maximum number of children that can be satisfied.
Example
Input:
g = [1, 2, 3]
s = [1, 1]

Output:
1

Explanation:
- Child with greed 1 gets cookie 1 → satisfied.
- Remaining cookie 1 cannot satisfy child with greed 2.
- Therefore, only 1 child is satisfied.
Brute Force Approach
1. Sort both arrays.
2. For every child, check all cookies.
3. If a cookie is:
   - not already used, and
   - large enough for the child,
   assign that cookie to the child.
4. Use a boolean[] array to keep track of cookies that have already been assigned.

Complexity
Time Complexity: O(n log n + m log m + n × m)
- Sorting children: O(n log n)
- Sorting cookies: O(m log m)
- Checking every child against cookies: O(n × m)
So overall:
O(n × m)
Space Complexity: O(m)
- boolean[] used requires O(m) space, where m is the number of cookies.


**/


import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        boolean[] used = new boolean[s.length];

        int satisfiedChild = 0;

        for (int childId = 0; childId < g.length; childId++) {

            for (int cookieId = 0; cookieId < s.length; cookieId++) {

                if (!used[cookieId] && s[cookieId] >= g[childId]) {

                    used[cookieId] = true;
                    satisfiedChild++;
                    break;
                }
            }
        }

        return satisfiedChild;
    }
}
