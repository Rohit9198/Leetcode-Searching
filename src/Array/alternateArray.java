package Array;

import java.util.ArrayList;

public class alternateArray {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4};
        ArrayList<Integer> ans = getAlternates(arr);
        System.out.println(ans);
    }
    public static  ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            ans.add(arr[i]);
        }

        return ans;
    }
}
