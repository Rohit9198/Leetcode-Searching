package Array;

public class oddEven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = countOddEven(arr);
        System.out.println("Odd = " + ans[0]);
        System.out.println("Even = " + ans[1]);
    }
    public static int[] countOddEven(int[] arr) {
        int even =0;
        int odd =0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                even++;
            }else{
                odd++;
            }

        }
        return new int[]{odd, even};
    }
}
