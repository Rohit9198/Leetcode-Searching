package Array;

public class maximum {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67,13, 34};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
