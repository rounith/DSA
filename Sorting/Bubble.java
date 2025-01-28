package Sorting;

import java.util.Arrays;
//O(n^2)
//stable sorting alogithm the order is maintained
public class Bubble {
    public static void main(String[] args) {
        int arr[]={7,4,33,5,32,67,3,1899};
        bubblesort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean swapped=false;//using if array is already sorted
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            } 
            if(!swapped)
            break;
        }
    }
}