public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        spiralMatrix(matrix);
    }

    public static void spiralMatrix(int arr[][]) {
        int startingRow = 0;
        int startingColumn = 0;
        int endingRow = arr.length-1;
        int endingCoumn = arr[0].length-1;

        while((startingRow <= endingRow) && (startingColumn <= endingCoumn)) {
            // top
            for(int i = startingColumn; i <= endingCoumn; i++) {
                System.out.print(arr[startingRow][i] + " ");
            }

            // right
            for(int i = startingRow+1; i <= endingRow; i++) {
                System.out.print(arr[i][endingCoumn] + " ");
            }

            // bottom
            for(int i = endingCoumn-1; i >= startingColumn; i--) {
                System.out.print(arr[endingRow][i] + " ");
                if(startingRow == endingRow) {
                    break;
                }
            }

            // left
            for(int i = endingRow-1; i >= startingRow+1; i--) {
                System.out.print(arr[i][startingColumn] + " ");
                if(startingColumn == endingCoumn) {
                    break;
                }
            }

            startingColumn++;
            startingRow++;
            endingCoumn--;
            endingRow--;
        }
    }
}