package Array;

public class palindromeArray {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 2, 1};
        boolean ans = isPalindrome(arr);
        System.out.println(ans);
    }
    public static boolean isPalindrome(int[] arr) {
        int left =0;
        int right = arr.length-1;

        while(left < right){
            if(arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
