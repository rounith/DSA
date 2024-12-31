package BinarySearch;

public class RotationNumber {
    public static void main(String[] args) {
        int[] arr={5,7,9,10,1,3,4};
        System.out.println(pivot(arr));
    }
    public static int pivot(int[] arr){
        int start=0,end=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            return mid+1;
            if(mid>start && arr[mid-1]>arr[mid])
            return mid;
            if(arr[start]>arr[mid])
            end=mid-1;
            else
            start=mid+1;
        }
        return -1;
    }
    
}
