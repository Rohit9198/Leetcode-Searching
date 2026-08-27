package Array;

public class countElement {

    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 8, 4, 5};
        int ans = countOfElements(9, arr);
        System.out.println(ans);
    }

    public static int countOfElements(int x, int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x) {
                count++;
            }
        }
        return count;
    }
}
