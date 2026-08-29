package Array;

public class typeArray {
    public static void main(String[] args) {
        int[] arr ={2, 1, 5, 4,3};
        int ans = typeOfArr(arr);
        System.out.println(ans);
    }

        static int typeOfArr(int arr[]) {
            int n = arr.length;
            int ascendingBreak = 0;
            int descendingBreak = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    ascendingBreak++;
                }
                if (arr[i] < arr[i + 1]) {
                    descendingBreak++;
                }
            }
            if (ascendingBreak == 0) {
                return 1;
            }
            if (descendingBreak == 0) {
                return 2;
            }
            if (ascendingBreak == 1) {
                return 4;
            }
            return 3;
        }
    }

