public class Main {
    public static void main(String[] args) {

        Client[] arr = {
            new Client("A", 20, 5000),
            new Client("B", 50, 7000),
            new Client("C", 80, 2000)
        };

        BubbleSort.sort(arr);

        System.out.println("Ascending:");
        for(Client c : arr) {
            System.out.println(c);
        }

        InsertionSort.sortDesc(arr);

        System.out.println("Descending:");
        for(Client c : arr) {
            System.out.println(c);
        }
    }
}
