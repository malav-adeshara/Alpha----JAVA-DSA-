public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        searchInSortedMatrix(arr, 16);
    }

    public static void searchInSortedMatrix(int arr[][], int key) {
        int startRow = 0;
        int endRow = arr.length-1;
        int startCol = 0;
        int endCol = arr[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            if(arr[endRow][startCol] == key) {
                System.out.println("Key found at index ("+endRow+","+startCol+").");
                return;
            }

            if(arr[endRow][startCol] > key) {
                endRow--;
            } else {
                startCol++;
            }
        }
    }
}
