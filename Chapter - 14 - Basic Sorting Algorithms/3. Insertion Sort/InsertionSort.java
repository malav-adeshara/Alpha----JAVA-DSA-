public class InsertionSort {
    public static void main(String[] args) {
        
    }

    public static void insertionSort(int arr[]) {
        int start = 1;
        int end = arr.length - 1;
        int sortedUpToIndex = 0;

        while(start <= end && sortedUpToIndex <= end) {
            if(arr[sortedUpToIndex] <= arr[start]) {
                start++;
                sortedUpToIndex++;
            } else if (arr[sortedUpToIndex] > arr[start]) {
                while(arr[sortedUpToIndex] >= arr[sortedUpToIndex+1] && sortedUpToIndex >= 0) {
                    int temp = arr[sortedUpToIndex+1];
                    arr[sortedUpToIndex+1] = arr[sortedUpToIndex];
                    arr[sortedUpToIndex] = temp;
                    sortedUpToIndex--;
                }
                sortedUpToIndex = start;
                start++;
            }
        }
    }
}
