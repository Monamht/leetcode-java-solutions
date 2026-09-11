/**💡 How It Works (Step-by-Step)Right-to-Left Traversal 
The for loop starts at index n.length() - 1 (the last character) and moves backward to index 0.
This aligns perfectly with positional notation in binary numbers, where values are calculated from the Least Significant Bit (LSB) to the Most Significant Bit (MSB).
Character to Integer Conversion: n.charAt(i) - '0' utilizes ASCII values. The ASCII value of '1' is 49 and '0' is 48. 
Subtracting '0' (48) results in a pure mathematical integer: 1 or 0.
Bitwise Power Evaluation: Instead of using the slower Math.pow(2, pow) function, this implementation uses the bitwise left-shift operator (1 << pow).
1 << 0 evaluates to \(1\) (\(2^{0}\))1 << 1 evaluates to \(2\) (\(2^{1}\))1 << 2 evaluates to \(4\) (\(2^{2}\)), and so on.
Summation: The decimal value is accumulated iteratively inside the deci variable and printed at the end. 
**/

class sol{
    public static void convertbintodeci(String n){
        int deci=0;
        int pow=0;
        int bit ;
        for(int i = n.length()-1; i>=0; i--){
            bit = n.charAt(i)-'0';
            deci=deci+bit*(1<<pow);
            pow++;
        }
        System.out.print(deci) ;
    }
}
public class Main{ 
    public static void  main(String [] args){
        String n = "1101";
        sol.convertbintodeci(n);
    }
}
