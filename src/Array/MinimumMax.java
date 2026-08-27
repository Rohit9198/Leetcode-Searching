package Array;

import java.util.ArrayList;

public class MinimumMax {
    public static void main(String[] args) {
        int[] arr={1, 4, 3, 5, 8, 6};
        ArrayList<Integer> ans = getMinMax(arr);
        System.out.println(ans);
    }
    public static ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> ans = new ArrayList<>();
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i] < min){
                min= arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        ans.add(min);
        ans.add(max);

        return ans;
    }
}
