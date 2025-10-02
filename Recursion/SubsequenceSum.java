import java.util.*;

public class NumberSubsequence {
    
    // Helper method to find all subsequences of numbers
    public static void subsequences(int[] arr, int index, int sum, List<Integer> current) {
        // Base case: if we've processed the entire array
        if (index == arr.length) {
          if(sum == 2)
            System.out.println(current);
            return;
        }

        // Recursive case 1: Include the current element
        current.add(arr[index]);
        sum=sum+arr[index];
        subsequences(arr, index + 1, sum, current);

        // Backtrack: remove the current element
        
        current.remove(current.size() - 1);
        sum=sum-arr[index];
        // Recursive case 2: Exclude the current element
        subsequences(arr, index + 1, sum, current);
    }
    
    // Method to start the process
    public static void generateSubsequences(int[] arr) {
        subsequences(arr, 0, 0, new ArrayList<>());
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1}; // Example array
        generateSubsequences(arr);
    }
}
