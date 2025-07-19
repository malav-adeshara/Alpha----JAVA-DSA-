public class countingSort {
    public static void main(String[] args) {
        
    }

    public static void countingSort(int arr[]) {
        int count[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int i=0;
        while(i < arr.length) {
            if(count[i] != 0) {
                System.out.println(i+1);
                count[i]--;
            } else {
                i++;
            }
        }
    }
}
