package Array;

public class minimumDistance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        int x = 1;
        int y = 2;
        int ans = minDist(arr, x, y);
        System.out.println(ans);
    }
    static int minDist(int arr[], int x, int y) {
        // code here
        int lastX = -1;
        int lastY = -1;
        int minDistance = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                lastX = i;
            }
            if(arr[i] == y){
                lastY = i;
            }
            if(lastX != -1 && lastY != -1){
                minDistance = Math.min(minDistance, Math.abs(lastX - lastY));
            }
        }
        if(minDistance == Integer.MAX_VALUE){
            return -1;
        }
        return minDistance;
    }
}
