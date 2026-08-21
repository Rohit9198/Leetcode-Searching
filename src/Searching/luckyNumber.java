package Searching;

import java.util.ArrayList;
import java.util.List;

public class luckyNumber {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
        List<Integer> answer = luckyNumbers(matrix);
        System.out.println(answer);
    }
    public static  List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;


        for(int i=0; i<row; i++){
            int min = matrix[i][0];
            int minColumn =0;
            for(int j=1; j< col; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    minColumn = j;
                }
            }
            // check if is maximum in its column
            boolean lucky = true;

            for(int j=0; j< row; j++){
                if(matrix[j][minColumn] > min){
                    lucky = false;
                    break;
                }
            }
            if(lucky){
                result.add(min);
            }
        }
        return result;
    }
}
