class Asset {
    String name;
    double returnRate;

    Asset(String name, double returnRate) {
        this.name = name;
        this.returnRate = returnRate;
    }

    public String toString() {
        return name + ": " + returnRate;
    }
}

public class Main {
    public static void main(String[] args) {

        Asset[] arr = {
            new Asset("AAPL", 12),
            new Asset("TSLA", 8),
            new Asset("GOOG", 15)
        };

        // simple bubble (asc)
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].returnRate > arr[j+1].returnRate){
                    Asset temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(Asset a: arr) System.out.println(a);
    }
}
