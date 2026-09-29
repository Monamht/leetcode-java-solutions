/**
📝 Problem StatementGiven a signed 32-bit integer n, return n with its digits reversed. 
If reversing n causes the value to go outside the signed 32-bit integer range \([-2^{31}, 2^{31} - 1]\), then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

⚙️ Constraints
• -2³¹ ≤ n ≤ 2³¹ - 1

🚀 Examples
Example 2
• Input: n = -123
• Output: -321
Example 3
• Input: n = 120
• Output: 21

📊 Complexity AnalysisTime Complexity: \(O(\log_{10}\vert{}n\vert{})\)
String Conversion & Reversal:
Converting the integer n to a string takes time proportional to the number of digits in n. 
The number of digits in a base-10 integer is given by \(\lfloor\log_{10}\vert{}n\vert{}\rfloor + 1\). 
Reversing the string using StringBuilder also takes linear time relative to the number of digits.Parsing: 
Parsing the string back into an integer takes linear time relative to the number of digits.
Overall, the execution time scales logarithmically with the value of the input number. 

Space Complexity: \(O(\log_{10}\vert{}n\vert{})\)Memory Allocation: The solution allocates additional memory to store the string representation (String s)
and the StringBuilder buffer. The amount of space used depends directly on the number of digits in the integer n. 

**/


import java.util.*;

class A{
  public static int reverseInt(int n ){
    String s = String.valueOf(n);
    boolean neg = s.charAt(0)=='-';
    if(neg){
      s=s.substring(1);
    }
    StringBuilder sb = new StringBuilder(s);
    String reversed = sb.reverse().toString();
  try {
    int ans = Integer.parseInt(reversed);
    return neg ? -ans: ans;
  }
  catch(NumberFormatException e){
    return 0;
  }
  }
}
public class Main {
    public static void main(String[] args) {
      int n = -1234;
      int res = A.reverseInt(n);
      System.out.println(res);
    }
}
