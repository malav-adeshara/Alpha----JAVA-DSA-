public class PrintPairsInArray {
    public static void main(String[] args) {
        int numbers[] = {0, -1, 6, 9, -60};
        int tp = printPairsInArray(numbers);
        System.out.println("Total pairs : " + tp);

        // for n elements in array tota pairs generates will be n*(n-1)/2
    }

    public static int printPairsInArray(int numbers[]) {
        int totalPairs = 0;
        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")  ");
                totalPairs++;
            }
            System.out.println();
        }
        return totalPairs;
    }
}
