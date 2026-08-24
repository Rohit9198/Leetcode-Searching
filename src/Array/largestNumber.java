package Array;

public class largestNumber {
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};
        int result = largest(arr);
        System.out.println(result);

    }
    public static int largest(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
