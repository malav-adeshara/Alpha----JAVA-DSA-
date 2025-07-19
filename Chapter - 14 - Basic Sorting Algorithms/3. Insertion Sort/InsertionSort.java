public class InsertionSort {
    public static void main(String[] args) {
        
    }

    public static void insertionSort(int arr[]) {
        int start = 1;
        int end = arr.length - 1;
        int sortedUpToIndex = 0;

        while(start <= end) {
            if(arr[sortedUpToIndex] <= arr[start]) {
                start++;
                sortedUpToIndex++;
            } else if (arr[sortedUpToIndex] > arr[start]) {
                while(arr[sortedUpToIndex] > arr[start] && sortedUpToIndex >= 0) {
                    sortedUpToIndex--;
                }
            }
        }
    }
}
