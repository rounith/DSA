package Sorting;

import java.util.Arrays;
//take max element and put it in its place
//O(N^2)
public class Selection {
    public static void main(String[] args) {
        int arr[]={7,4,33,5,32,67,3,1899};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            int max=getmax(arr,i);
            if(arr[max]>arr[i]){
                int temp=arr[i];
                    arr[i]=arr[max];
                    arr[max]=temp;
            }
        }
    }
    static int getmax(int[] arr,int end){
        int max=0;
        for(int i=0;i<=end;i++){
            if(arr[i]>arr[max])
            max=i;
        }
        return max;
    }
}
