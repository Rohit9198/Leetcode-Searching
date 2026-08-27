package Array;

public class replace0With5 {
    public static void main(String[] args) {
       int n = 1004;
       int ans = convertFive(n);
        System.out.println(ans);
    }
    public static int convertFive(int n) {
        if(n==0){
            return 5;
        }
        int result =0;
        int place =1;
        while(n > 0){
            int digit = n%10;
            if(digit == 0){
                digit = 5;
            }
            result = result + digit * place;
            place = place * 10;
            n = n/10;
        }
        return result;
    }
}
