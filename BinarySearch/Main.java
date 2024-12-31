package BinarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {39, 78, 2, 98, 0, 37, 87, 4};
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1;
        int target = 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("Target found at index: " + mid);
                return;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("No");
    }   
}
