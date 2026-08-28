package Array;

import java.util.Arrays;

public class swap {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        swapKth(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void swapKth(int[] arr, int k) {
        int first = k - 1;
        int second = arr.length - k;
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}