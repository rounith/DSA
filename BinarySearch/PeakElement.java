package BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr={2,5,7,9,54,68,78,89,90,84,75,67,53,32,12,4};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
                // even if element is found we will iterate until
                // single element is in the arry
                end = mid;
            else
                start = mid + 1;
        }
        return arr[end];// end,mid,start all are at one position
    }
}
