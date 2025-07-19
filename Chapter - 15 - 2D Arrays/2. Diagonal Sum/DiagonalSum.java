public class DiagonalSum {
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4, 9},
            {4, 3, 2, 1, 9},
            {5, 6, 7, 8, 9},
            {8, 7, 6, 5, 9},
            {9, 9, 9, 9, 9}
        };
        System.out.println("Diagonal su of given matrix is : " + diagonalSum(matrix));
    }

    public static int diagonalSum(int arr[][]) {
        // solution:1 - (Brute force approach) Use 2 nasted loops, traverse whole matrix and find sum

        // solution:2 - (optimal one) Use 1 single loop and find the sum using matrix diagonal's property
        // i = j in primary diagonal
        // i + j = n-1 in secondary diagonal

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            // primary diagonal sum
            sum += arr[i][i];

            // secondary diagonal sum
            if(i != arr.length-i-1) { // to avoid middle element sum 2 times in case of odd n
                sum += arr[i][arr.length-i-1];
            }
        }
        return sum;

    }
}
