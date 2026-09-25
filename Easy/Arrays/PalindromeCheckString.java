/** 
You are given a string s. Return true if the string is palindrome, otherwise false.
A string is called palindrome if it reads the same forward and backward.
Example 1:
Input : s = "hannah"
Output : true
Explanation :
The given string when read backward is -> "hannah", which is same as when read forward.
Hence answer is true.

Example 2:
Input : s = "aabbaaa"
Output : false
Explanation :
The given string when read backward is -> "aaabbaa", which is not same as when read forward.
Hence answer is false.
**/
//OPTIMAL APPROACH
class Solution {   
    public boolean palindromeCheck(String s) {
        // Handle empty or single-character strings
        if (s == null || s.length() <= 1) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;
        
        // Move pointers toward the middle
        while (left < right) {
            // If characters at current positions don't match, it's not a palindrome
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;  // Move right
            right--; // Move left
        }
        
        return true; // All characters matched
    }
}

//BRUTE FORCE APPROACH 
class Solution {   
    public boolean palindromeCheck(String s) {
        // Handle null case
        if (s == null) return false;
        
        String reversed = "";
        
        // Loop backwards through the string and build the reversed version
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i); 
        }
        
        // Compare the text content of the two strings
        return s.equals(reversed);
    }
}

