package BinarySearch;
//Find the smallest number which is greater or equal to the given number
//[1,3,5,8,14,67,89] target=4 then output should be 67
public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={1,3,5,8,9,14,16,24,89};
        int start = 0, end = arr.length - 1;
        int target = 6;
        int mid=0;
        
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("Target found at index: " + mid);
                return;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(arr[start]);//keep end it becomes floorofnum
    }
}
