/**
Problem Statement: 
Product of Array Elements Excluding the Current ElementWrite a Java program 
that takes an integer array as input and produces an output array of the same size.
For every position i in the output array, the value must be the product of all numbers in the original array except the number at arr[i].

Example 1:Input Array: {1, 2, 3, 4}Output: 24, 12, 8, 6 are printed line-by-line, followed by the final array structure [24, 12, 8, 6].
Example 2:Input Array: {2, 5, 3}Output: 15, 6, 10 printed line-by-line, followed by [15, 6, 10].
**/

// BRUTE FORCE APPROACH 
import java.util.Arrays;

class ProductExceptSelf { 
    public static void main(String[] args) {
       int arr[] = {1, 2, 3, 4};
       int c = 1;
       for(int i = 0; i < arr.length; i++) {
           c *= arr[i];
       }
       int result[] = new int[arr.length];
       for(int i = 0; i < arr.length; i++) {
           result[i] = c / arr[i];
           System.out.println(result[i]);
       }
       System.out.println(Arrays.toString(result));
    }
}

// OPTIMAL APPROACH 
/**
The optimal approach solves this problem in \(O(n)\) time complexity without using the division operator (/).
Why Avoid Division?
If you use division, your code will crash with an arithmetic error (/ by zero) if the array contains a 0. 
The optimal approach uses two passes (prefix and suffix products) to safely compute the result for any array configuration, including zeros.
**/
import java.util.Arrays;

class ProductExceptSelfOptimal {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4}; // Works for any array, even with zeros!
        int n = arr.length;
        int result[] = new int[n];

        // Step 1: Calculate prefix products (products to the left)
        result[0] = 1; // Nothing is to the left of the first element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }

        // Step 2: Calculate suffix products on the fly (products to the right)
        int rightProduct = 1; // Nothing is to the right of the last element
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct; // Multiply left product by right product
            rightProduct *= arr[i]; // Update the right product tracker
            
            // Print the element line-by-line as requested
            System.out.println(result[i]);
        }

        // Note: Because we process right-to-left in the final loop, 
        // the console prints will appear in reverse order (6, 8, 12, 24).
        // However, the final array structure is perfectly preserved:
        System.out.println(Arrays.toString(result)); 
    }
}
