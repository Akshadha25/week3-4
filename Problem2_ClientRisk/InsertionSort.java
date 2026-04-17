class InsertionSort {
    static void sortDesc(Client arr[]) {
        for(int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j].riskScore < key.riskScore) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
