package Array;

import java.util.ArrayList;

public class strongNeigbhour {
    public static void main(String[] args) {
        int[] arr ={1, 2, 2, 3, 4,5};
        ArrayList<Integer> ans = maxAdj(arr);
        System.out.println(ans);
    }
    public static ArrayList<Integer> maxAdj(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            int max = Math.max(arr[i], arr[i+1]);
            ans.add(max);
        }
        return ans;
    }
}
