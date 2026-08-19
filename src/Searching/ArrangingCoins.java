package Searching;

public class ArrangingCoins {
    public static void main(String[] args) {
      int n=8;
        System.out.println(arrangeCoin(n));
    }
    public static int arrangeCoin(int n){
        long start = 0;
        long end = n;
        while(start <= end){
            long mid = start +(end - start)/2;

            long coinsRequired = mid * ( mid -1);
            if(coinsRequired == n){
                return (int) mid;
            }else if (coinsRequired < n){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return (int)end;
    }
}
