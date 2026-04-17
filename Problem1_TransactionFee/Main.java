public class Main {
    public static void main(String[] args) {

        Transaction[] arr = {
            new Transaction("id1", 10.5, "10:00"),
            new Transaction("id2", 25.0, "09:30"),
            new Transaction("id3", 5.0, "10:15")
        };

        BubbleSort.sort(arr);

        System.out.println("Bubble Sort Result:");
        for(Transaction t : arr) {
            System.out.println(t);
        }
    }
}
