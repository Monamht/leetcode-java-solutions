/*Problem Statement: Given an array of size n, write a program to check if the given array 
is sorted in (ascending / Increasing / Non-decreasing) order or not. 
If the array is sorted then return True, Else return False. 
(brute force approach).
Time Complexity : O(N log N)
behind : Steps happening:

Copy array → O(n)

Sort array → O(n log n)

Compare arrays → O(n)

'*/

import java.util.Arrays;
public class checksort3 {
    public static boolean checkarraysort(int[] arr){
        int[] copy=Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        return Arrays.equals(copy,arr);
    }
    public static void main(String[] args) {
        int[] arr={23,45,1,67,2,89,34,90};
        boolean result=checkarraysort(arr);
        if(result){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
