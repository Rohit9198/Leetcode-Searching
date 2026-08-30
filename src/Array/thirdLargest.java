package Array;

import java.util.ArrayList;
import java.util.List;

public class thirdLargest {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(1);
        arr.add(3);
        arr.add(5);
        int ans = thirdLargest(arr);
        System.out.println(ans);
    }
    public static int thirdLargest(List<Integer> arr) {
        // code here
        if(arr.size() < 3){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.size(); i++){
            int current = arr.get(i);

            if(current >= largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = current;
            }
            else if(current >= secondLargest){
                thirdLargest = secondLargest;
                secondLargest = current;
            }else if(current >= thirdLargest){
                thirdLargest = current;
            }
        }
        return thirdLargest;
    }
}
