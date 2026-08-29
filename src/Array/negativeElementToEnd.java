package Array;

import java.util.Arrays;

public class negativeElementToEnd {
    public static void main(String[] args) {
       int[] arr ={1, -1, 3, 2, -7, -5, 11, 6};
       segregateElements(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void segregateElements(int[] arr) {
        // code here
        int n = arr.length;
        int[] temp = new int[n];
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 0 ){
                temp[j] = arr[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] <0){
                temp[j] = arr[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
    }
}
