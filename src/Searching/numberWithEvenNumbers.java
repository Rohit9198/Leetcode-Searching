package Searching;

public class numberWithEvenNumbers {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int answer = findNumbers(nums);
        System.out.println(answer);
    }
    public static int findNumbers(int[] nums) {
        int count =0;
        for(int i=0; i< nums.length; i++){
            String s = String.valueOf(nums[i]);
            if(s.length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
