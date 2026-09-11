// Converting Decimal number to Binary number using Bit Manipulation and java collection framework .

/** 📊 Complexity Summary
Time Complexity: (O(log_2 n)) (Logarithmic time)
Space Complexity: (O(log_2 n)) (Logarithmic space)

💡 Brief Explanation
Why Time is (O(log_2 n)): Every time the while loop runs, you divide n by 2 using the right-shift operator (n >> 1). 
The number of times you can divide a number n by 2 until it reaches 0 is exactly (log _{2}n). 
Reversing the array list using Collections.reverse(list) also takes linear time relative to the list size, which is \(O(\log_2 n)\). 
Adding these together ((O(log_2 n) + O(log_2 n))) gives a total time complexity of (O(log_2 n)).

Why Space is (O(log_2 n)): The size of your ArrayList grows dynamically based on how many bits the number has. 
A number n requires exactly ( lfloor log_2 n floor + 1) bits to be represented in binary. 
Therefore, the list dynamically stores elements proportional to (O(log_2 n)).***/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class sol{
    public static void convertdecitobin(int n){
        ArrayList <Integer> list = new ArrayList<>();
        while(n>0){
            if((n&1)==1){
                list.add(1);
            }
            else{
                list.add(0);
            }
            n=n>>1;
        }
        Collections.reverse(list);
        System.out.print(list.toString());
    }
}
public class Main {
    public static void main(String[] args) {
        int n=13 ;
        sol.convertdecitobin(n);
    }
}


// Another way (using array)

/**📊 Complexity SummaryTime Complexity: \(O(1)\) or \(O(\text{constant})\) (Assuming a fixed array size like 8 or 32)
  Space Complexity: \(O(1)\) (Constant space)
  
  💡Brief ExplanationWhy Time is \(O(1)\): Even though your while loop runs \(\log _{2}n\) times to calculate the bits,
  your for loop always iterates a fixed number of times (bin.length - 1 down to 0), 
  which is exactly 8 times in your code. Because the maximum number of operations is strictly capped by a hardcoded constant (8 iterations),
  the runtime doesn't scale infinitely with n. It runs in \(O(1)\) constant time (though it will crash for any n >= 256 because an 8-bit array will overflow).
  
  Why Space is \(O(1)\): You are allocating a fixed-size primitive array int[8].
  Regardless of whether n is 1, 5, or 13, the memory allocated remains exactly the same (8 integer slots). 
  Since the memory footprint does not change with the size of the input, the space complexity is \(O(1)\).**/

class sol{
    public static void convertdecitobin(int n){
        int [] bin = new int[8];
        int i=0;
        while(n>0){
            bin[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=bin.length-1 ; j>=0; j--){
            System.out.print(bin[j]);
        }
    }
}
public class Main{
    public static void main(String [] args){
        int n = 13;
        sol.convertdecitobin(n);
    }
}  
