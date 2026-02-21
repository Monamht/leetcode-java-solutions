/*Problem Statement: Given an array of size n, write a program to check if the given array 
is sorted in (ascending / Increasing / Non-decreasing) order or not. 
If the array is sorted then return True, Else return False. (brute force approach).
Time Complexity : O(N^2)*/

public class checkarrayissort {
    public static boolean checksort(int[] arr){
        for(int i=0; i <arr.length;i++){
            for(int j=1; j<arr.length-1;j++){
                if(arr[i]<arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,23,67,89,90};
        System.out.println("Checked whether the array is sorted or not : "+ checksort(arr));
    }

}
