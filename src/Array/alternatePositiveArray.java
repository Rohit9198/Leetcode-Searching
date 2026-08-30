package Array;

import java.util.ArrayList;

public class alternatePositiveArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(4);
        arr.add(-2);
        arr.add(-1);
        arr.add(5);
        arr.add(0);
        arr.add(-5);
        arr.add(-3);
        arr.add(2);
        rearrange(arr);
        System.out.println(arr);
    }
    static void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) >= 0){
                positive.add(arr.get(i));
            }else{
                negative.add(arr.get(i));
            }
        }
        int i=0;
        int p= 0;
        int n =0;

        while(p < positive.size() && n< negative.size()){
            arr.set(i, positive.get(p));
            p++;
            i++;

            arr.set(i, negative.get(n));
            n++;
            i++;
        }
        while(p < positive.size()){
            arr.set(i, positive.get(p));
            p++;
            i++;
        }
        while(n < negative.size()){
            arr.set(i, negative.get(n));
            n++;
            i++;
        }
    }
}
