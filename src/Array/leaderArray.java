package Array;

import java.util.ArrayList;
import java.util.Collections;

public class leaderArray {
    public static void main(String[] args) {
     int[] arr = {16, 17, 4, 3, 5, 2};
     ArrayList<Integer> ans = leaders(arr);
        System.out.println(ans);
    }
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[arr.length -1];
        ans.add(max);

        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] > max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
