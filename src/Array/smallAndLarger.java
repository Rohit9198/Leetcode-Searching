package Array;

import java.util.Arrays;

public class smallAndLarger {
    public static void main(String[] args) {
        int[] arr={1, 2, 8, 10, 11, 12, 19};
        int[] ans = getMoreAndLess(arr, 12);
        System.out.println(Arrays.toString(ans));
    }
    static int[] getMoreAndLess(int[] arr, int target) {
        int less = 0;
        int greatest= 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= target){
                less++;
            }
            if(arr[i] >= target){
                greatest++;
            }

        }
        return new int[]{less, greatest};
    }
}
