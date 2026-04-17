public class Main {
    public static void main(String[] args) {

        String[] arr = {"B","A","B","C"};

        // Linear search
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("B")){
                System.out.println("Found at "+i);
                break;
            }
        }

        // Binary requires sorted
        java.util.Arrays.sort(arr);

        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid].equals("B")){
                System.out.println("Binary found at "+mid);
                break;
            }
            else if(arr[mid].compareTo("B")<0) low=mid+1;
            else high=mid-1;
        }
    }
}
