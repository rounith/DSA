package LinearSearch;

public class Min {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 17, 8, 9, 0, -46, -3 };
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println(min);
    }
}
