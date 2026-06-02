/**Set Matrix Zero

Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix..
Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.

Input: matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output:[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
Explanation:Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and 4th column will be set to 0
**/
//BRUTE FORCE APPROACH 
/**
Think of the matrix as a chessboard. If you see a zero somewhere, you need to wipe out its whole row and column to zero. 
In brute force, the moment you find a zero, you immediately mark its entire row and column. But here’s the trap if you set them to zero immediately, we might mess up future checks because a newly placed zero could cause extra unwanted zeroing. 
To avoid that, we use a special marker value (like -1 or something that can’t exist in the input) to mark places where zeros should be placed later. Once the scanning is done, we do a second pass and replace all markers with 0.
1)Traverse the entire matrix.
2)If an element is zero:
   a)Mark all elements in its row (except already zero) as -1.
   b)Mark all elements in its column (except already zero) as -1.
3)Once the full traversal is complete, replace all -1 with 0.

Complexity Analysis 
Time Complexity: O(m * n * (m + n)), We iterate through every cell (m * n), and for each zero, we potentially mark its entire row (O(n)) and column (O(m)), leading to O(m * n * (m + n)) overall.
Space Complexity: O(1), We are not using any extra data structures, only modifying the matrix in place (apart from a few variables).
**/

import java.util.*;
class Solution {
    // Function to set entire row and column to 0 if an element in the matrix is 0
    public void setZeroes(int[][] matrix) {
        // Get number of rows
        int m = matrix.length;
        // Get number of columns
        int n = matrix[0].length;

        // First pass: mark rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the cell is zero
                if (matrix[i][j] == 0) {
                    // Mark entire row as -1 (except zeros)
                    for (int col = 0; col < n; col++) {
                        if (matrix[i][col] != 0)
                            matrix[i][col] = -1;
                    }
                    // Mark entire column as -1 (except zeros)
                    for (int row = 0; row < m; row++) {
                        if (matrix[row][j] != 0)
                            matrix[row][j] = -1;
                    }
                }
            }
        }

        // Second pass: replace -1 with 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1)
                    matrix[i][j] = 0;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        
        // Create Solution object
        Solution sol = new Solution();
        // Modify matrix
        sol.setZeroes(matrix);
        
        // Print result
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
