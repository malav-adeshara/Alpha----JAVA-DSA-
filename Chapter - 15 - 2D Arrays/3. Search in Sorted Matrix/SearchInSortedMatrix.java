public class SearchInSortedMatrix {
    public static void main(String[] args) {
        
    }

    public static void searchInSortedMatrix(int arr[][], int key) {
        int startRow = 0;
        int endRow = arr.length;
        int startCol = 0;
        int endCol = arr[0].length;

        while(startRow <= endRow && startCol <= endCol) {
            if(arr[endRow][startCol] == key) {
                return true;
            }
        }
    }
}
