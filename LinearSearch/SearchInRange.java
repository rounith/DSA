package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int s=2;
        int e=6;
        int[] arr={2,5,7,2,5,9,1,3};
        int target=3;
        int i;
        for(i=s;i<=e;i++){
            if(arr[i]==target){
                System.out.println("Yes at "+ i);
                break;
            }
        }
        if(i>e){
            System.out.println("No");
        }
    }
}
