/** 
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
After sorting:
Children: 1 2 3
Cookies:  1 1

The first cookie satisfies the child with greed 1.
The second cookie is too small for the child with greed 2.
Therefore, the maximum number of satisfied children is 1.
Approach — Greedy
1. Sort both arrays.
2. Start with the least greedy child.
3. Check cookies from smallest to largest.
4. If the current cookie can satisfy the child, assign it and move to the next child.
5. If the cookie is too small, skip it and try the next cookie.


Complexity
Time Complexity: O(n log n + m log m)
- Sorting children: O(n log n)
- Sorting cookies: O(m log m)
- Traversing cookies: O(m)
Space Complexity: O(1) extra space (ignoring the space used internally by Java's sorting implementation).


**/

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int childid = 0;

        for (int cookieid = 0;
             cookieid < s.length && childid < g.length;
             cookieid++) {

            if (s[cookieid] >= g[childid]) {
                childid++;
            }
        }

        return childid;
    }
}





