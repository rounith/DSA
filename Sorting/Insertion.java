package Sorting;

import java.util.Arrays;
//O(N^2)
//O(N)
public class Insertion {
    public static void main(String[] args) {
        int arr[]={7,4,33,5,32,67,3,1899};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]>arr[j-1])
                break;
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
    }
}
//