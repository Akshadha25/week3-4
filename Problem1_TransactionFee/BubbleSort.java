class BubbleSort {
    static void sort(Transaction arr[]) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            boolean swapped = false;
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j].fee > arr[j+1].fee) {
                    Transaction temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}
