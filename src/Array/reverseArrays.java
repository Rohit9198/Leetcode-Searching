package Array;

import java.util.Arrays;

public class reverseArrays {
    public static void main(String[] args) {
       int[] arr = {1, 4, 3, 2, 6, 5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseArray(int arr[]) {
        // code here
        int j=arr.length - 1;
        for(int i=0; i< j; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
}
