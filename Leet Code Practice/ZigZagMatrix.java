public class ZigZagMatrix {
    public static void main(String[] args) {
        int mat[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
    }

    public static zigZagMatrix (int arr[][]) {
        int startRow = 0;
        int endRow = arr.length;
        int startCol = 0;
        int endCol = arr[0].length;

        while(startRow <= endRow && startCol <= endCol) {
            int i = startRow;
            int j = startCol;

            while(i <= j) {
                System.out.println(arr[i][j]);
                startRow++;
                
            }

        }
    }
}
