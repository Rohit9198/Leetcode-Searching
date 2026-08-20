package Searching;

public class matrixRotation {

    public static void main(String[] args) {

        int[][] mat = {
                {0, 1},
                {1, 0}
        };
        int[][] target = {
                {1, 0},
                {0, 1}
        };
        boolean result = findRotation(mat, target);
        System.out.println(result);
    }
    public static boolean findRotation(int[][] mat, int[][] target) {

        for (int rotation = 0; rotation < 4; rotation++) {

            if (isEqual(mat, target)) {
                return true;
            }

            rotate(mat);
        }

        return false;
    }


    public static boolean isEqual(int[][] mat, int[][] target) {

        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }


    public static void rotate(int[][] mat) {

        int n = mat.length;

        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                rotated[j][n - 1 - i] = mat[i][j];
            }
        }

        // Copy rotated matrix back to mat
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                mat[i][j] = rotated[i][j];
            }
        }
    }
}