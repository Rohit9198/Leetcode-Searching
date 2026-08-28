package Array;

public class fineCar {
    public static void main(String[] args) {
        int date = 12;
        int[] car = {2375, 7682, 2325, 2352};
        int[] fine = {250, 500, 350, 200};
        long ans = totalFine(date, car, fine);
        System.out.println(ans);
    }

        public static long totalFine(int date, int car[], int fine[]) {

            long sum = 0;
            for (int i = 0; i < car.length; i++) {
                if (date % 2 == 0) {
                    if (car[i] % 2 != 0) {
                        sum += fine[i];
                    }

                } else {
                    if (car[i] % 2 == 0) {
                        sum += fine[i];
                    }
                }
            }
            return sum;
        }
    }
