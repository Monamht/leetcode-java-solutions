/*Problem Statement: Given an array of size n, write a program to check if the given array 
is sorted in (ascending / Increasing / Non-decreasing) order or not. 
If the array is sorted then return True, Else return False. 
(optimal approach)
Time Complexity : O(N)*/
public class checkarraysort2 {
    public static boolean checksort(int[] arr){
        for (int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,7,8,4};
        System.out.println(checksort(arr));
    }
}
