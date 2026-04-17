class InsertionSort {
    static void sort(Transaction arr[]) {
        for(int i = 1; i < arr.length; i++) {
            Transaction key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j].fee > key.fee) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
