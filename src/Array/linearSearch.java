package Array;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr= {12, 3, 27, 53, 18, 62, 88, 6, 53};
        int target = 88;
        boolean flag = false;

        for(int i=1; i< arr.length; i++){
            if(arr[i] == target){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("Target exist in Array");
        }else{
            System.out.println("Target missing in Array");
        }
    }
}
