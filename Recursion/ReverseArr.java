package Recursion;

public class ReverseArr {
    public static void reverse(int[] arr,int max,int min){
        if(max==min || min>max)
        return;
        int temp=0;
        arr[max]=temp;
        System.out.println(arr[max]);
        arr[max]=arr[min];
        arr[min]=temp;
        reverse(arr,max-1,min+1);
    }
    public static void main(String[] args){
        int[] arr={1,4,3,2,9};
        reverse(arr,arr.length-1,0);
        for(int i=0;i<arr.length-1;i++)
        System.out.print(arr[i]);
    }
    
}
