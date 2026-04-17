public class Main {
    public static void main(String[] args) {

        Trade[] arr = {
            new Trade(500),
            new Trade(100),
            new Trade(300)
        };

        MergeSort.sort(arr, 0, arr.length-1);

        System.out.println("Merge Sort:");
        for(Trade t : arr) System.out.println(t);

        QuickSort.sort(arr, 0, arr.length-1);

        System.out.println("Quick Sort DESC:");
        for(Trade t : arr) System.out.println(t);
    }
}
