package Searching;

public class maximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {
                {1993, 1999},
                {2000, 2010},
                {1990, 2000}
        };
        int answer = maximumPopulation(logs);
        System.out.println(answer);
    }
    public static int maximumPopulation(int[][] logs) {
        int[] populations = new int[101];

        for(int[] log : logs){
            int birth = log[0];
            int death = log[1];

            populations[birth - 1950]++;
            populations[death - 1950]--;
        }
        int currentPopulation = 0;
        int maxPopulation = 0;
        int answer = 1950;

        for(int i =0; i< 101; i++){
            currentPopulation += populations[i];

            if(currentPopulation > maxPopulation){
                maxPopulation = currentPopulation;
                answer = 1950 + i;
            }
        }
        return answer;
    }
}
