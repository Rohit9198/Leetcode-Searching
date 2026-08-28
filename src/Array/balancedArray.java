package Array;

import java.util.ArrayList;
import java.util.List;

public class balancedArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(3);
        arr.add(2);
        int ans = minValueToBalance(arr);
        System.out.println(ans);
    }
    public static int minValueToBalance(List<Integer> arr) {
        int mid = arr.size()/2;
        int leftSum =0;
        int rightSum =0;
        for(int i=0; i< mid; i++){
            leftSum += arr.get(i);
        }
        for(int i= mid; i<arr.size(); i++){
            rightSum += arr.get(i);
        }
        return Math.abs(leftSum - rightSum);

    }
}
