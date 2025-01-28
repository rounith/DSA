package Sorting;

import java.util.Arrays;

//one pass sorting 
//when given numbers are from 1 to N continous.
public class Cyclic {
    public static void main(String[] args) {
        int arr[] = {1,5,2,4,3};
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                // Swap the current element to its correct position
                int correctIndex = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
