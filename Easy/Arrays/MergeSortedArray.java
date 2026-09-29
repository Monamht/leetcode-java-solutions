//Merging two sorted array
import java.util.Arrays;

public class NewClass1 {
  public static void main(String[] args){
    int [] arr1 = {1, 3, 5};
    int [] arr2 = {2, 4, 6};
    int n = arr1.length;
    int m = arr2.length;
    int [] arr3 = new int[n + m];
    
    for(int i = 0; i < n; i++){
      arr3[i] = arr1[i];
    }
    
    for(int j = 0; j < m; j++){
      // FIX: Shifted the index by adding 'n' so elements are placed after arr1
      arr3[n + j] = arr2[j]; 
    }
    
    Arrays.sort(arr3);
    
    for(int k = 0; k < m + n; k++){
      System.out.print(arr3[k] + " "); // Added a space for cleaner readability
    }
  }
}
