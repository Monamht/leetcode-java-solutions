/**# Merge Two Sorted Arrays
## Problem Statement
Given two sorted arrays `a[]` and `b[]` of sizes `n` and `m`, merge them into a single sorted array such that the resulting array remains sorted.
### Example
**Input**
```text
a = [1, 3, 5, 7]
b = [2, 4, 6, 8]
```
**Output**
[1, 2, 3, 4, 5, 6, 7, 8]
---

## Approach: Two Pointer Technique
Since both arrays are already sorted, we can efficiently merge them by comparing elements from both arrays and placing the smaller element into a new result array.

### Step 1: Create a Result Array
Create a new array `merged[]` of size `n + m` to store all elements from both arrays.

### Step 2: Initialize Three Pointers
- `i` → points to the current element in array `a`
- `j` → points to the current element in array `b`
- `k` → points to the current position in the merged array

```java
int i = 0, j = 0, k = 0;
```
### Step 3: Compare and Merge
While both arrays contain elements:

- Compare `a[i]` and `b[j]`
- Insert the smaller element into `merged[k]`
- Move the corresponding pointer forward
- Increment `k`

```java
while (i < n && j < m) {
    if (a[i] <= b[j]) {
        merged[k++] = a[i++];
    } else {
        merged[k++] = b[j++];
    }
}
```

### Step 4: Copy Remaining Elements of First Array

If array `a` still has elements left:

```java
while (i < n) {
    merged[k++] = a[i++];
}
```

### Step 5: Copy Remaining Elements of Second Array

If array `b` still has elements left:

```java
while (j < m) {
    merged[k++] = b[j++];
}
```

---

## Dry Run

### Input

```text
a = [1, 3, 5, 7]
b = [2, 4, 6, 8]
```

### Iterations

| a[i] | b[j] | Selected Element | Merged Array |
|------|------|------------------|-------------|
| 1 | 2 | 1 | [1] |
| 3 | 2 | 2 | [1, 2] |
| 3 | 4 | 3 | [1, 2, 3] |
| 5 | 4 | 4 | [1, 2, 3, 4] |
| 5 | 6 | 5 | [1, 2, 3, 4, 5] |
| 7 | 6 | 6 | [1, 2, 3, 4, 5, 6] |
| 7 | 8 | 7 | [1, 2, 3, 4, 5, 6, 7] |

Array `a` is exhausted.

Copy the remaining element from array `b`.

### Final Output

```text
[1, 2, 3, 4, 5, 6, 7, 8]
```

---
**/

class Solution {
    public int[] mergeTwoSortedArrays(int[] a, int[] b) {

        int n = a.length;
        int m = b.length;

        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Merge both arrays while elements remain in both
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }

        // Copy remaining elements from first array
        while (i < n) {
            merged[k++] = a[i++];
        }

        // Copy remaining elements from second array
        while (j < m) {
            merged[k++] = b[j++];
        }

        return merged;
    }
}

public class MergeTwoSortedArrays {
    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        Solution sol = new Solution();
        int[] result = sol.mergeTwoSortedArrays(a, b);

        System.out.print("Merged Array: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

/**## Complexity Analysis

### Time Complexity
- Each element from both arrays is processed exactly once.
O(n + m)

where:
- `n` = size of first array
- `m` = size of second array

### Space Complexity
- An additional array of size `n + m` is used.
O(n + m)

## Key Takeaway

This problem is a classic application of the **Two Pointer Technique**. By traversing both sorted arrays simultaneously and always selecting the smaller element, we can merge them efficiently in **O(n + m)** time.
  **/
