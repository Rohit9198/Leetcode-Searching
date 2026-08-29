package Array;

import java.util.ArrayList;

public class duplicateMissing {
    public static void main(String[] args) {
    int[] arr = {2, 2};
    ArrayList<Integer> ans = duplicatesMissingArray(arr);
        System.out.println(ans);
    }
    public static ArrayList<Integer> duplicatesMissingArray(int[] arr) {
        // code here
        int n = arr.length;
        int[] count = new int[n + 1];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }
        for(int i=1; i<=n; i++){

            if (count[i] == 0) {
                ans.add(i);       // missing
            }

            if(count[i] == 2){
                ans.add(i);
            }
        }
        return ans;
    }
}
