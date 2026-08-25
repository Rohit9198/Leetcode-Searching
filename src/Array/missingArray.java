package Array;

public class missingArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};

        int ans = missingSum(arr);

        System.out.println(ans);
    }

    static int missingSum(int[] arr) {

        int n = arr.length + 1;

        int sum = n * (n + 1) / 2;

        int arraySum = 0;

        for (int ele : arr) {
            arraySum += ele;
        }

        return sum - arraySum;
    }
}