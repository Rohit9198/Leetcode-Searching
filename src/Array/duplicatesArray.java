package Array;

import java.util.ArrayList;

public class duplicatesArray {
    public static void main(String[] args) {
        int[] arr ={2, 3, 1, 2, 3};
        ArrayList<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
    }
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        int[] count = new int[n + 1];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }
        for(int i=1; i<=n; i++){
            if(count[i] == 2){
                ans.add(i);
            }
        }
        return ans;
    }
}
