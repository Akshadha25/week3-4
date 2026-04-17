class QuickSort {

    static int partition(Trade arr[], int low, int high) {
        int pivot = arr[high].volume;
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(arr[j].volume > pivot) { // DESC
                i++;
                Trade temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Trade temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    static void sort(Trade arr[], int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}
