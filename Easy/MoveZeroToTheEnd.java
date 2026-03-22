/*
===========================================================
🟢 Problem: Move all Zeros to the End of the Array

You are given an array of integers. Your task is to move all 
the zeros in the array to the end while maintaining the 
relative order of the non-zero elements.

Example:
Input:  [1, 0, 2, 3, 0, 4, 0, 1]
Output: [1, 2, 3, 4, 1, 0, 0, 0]

===========================================================

🟡 Approach: Brute Force (Using Extra Arrays)

1. Create two arrays:
   - One for non-zero elements
   - One for zero elements

2. Traverse the original array:
   - If element is non-zero → store in nonzero array
   - If element is zero → store in zero array

3. Merge both arrays:
   - First add all non-zero elements
   - Then add all zeros at the end

===========================================================

❓ Why is this Brute Force?

- It uses extra space (two additional arrays)
- Not memory efficient
- A better optimal solution exists (two-pointer approach with O(1) space)
⏱ Time Complexity:
- Traversing array → O(n)
- Merging arrays → O(n)
👉 Overall: O(n)

📦 Space Complexity:
- Two extra arrays of size n
👉 Overall: O(n)

===========================================================
*/public class zeroend {
    public static void main(String[] args){

        int [] arr = {1,0,2,3,0,4,0,1}; // original array
        int n = arr.length;

        // creating two separate arrays
        int [] nonzero = new int[n];
        int [] zero = new int[n];
        
        // initializing index for both arrays
        int nIndex = 0;
        int zIndex = 0;

        // Step 1: Separate elements
        for(int i = 0; i < n; i++){
            if (arr[i] == 0){
                zero[zIndex++] = arr[i];
            }
            else{
                nonzero[nIndex++] = arr[i];
            }
        }

        // Step 2: Merge back into original array
        int index = 0;

        // Add non-zero elements
        for (int i = 0; i < nIndex; i++) {
            arr[index++] = nonzero[i];
        }

        // Add zeros
        for (int i = 0; i < zIndex; i++) {
            arr[index++] = zero[i];
        }
// Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

===========================================================
