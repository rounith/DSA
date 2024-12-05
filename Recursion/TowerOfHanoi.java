package Recursion;

public class TowerOfHanoi {
    
    public static void print(int n, String src, String helper, String dest) {
        // Base case: when there's no block to move
        if (n == 0) {
            return;
        }

        // Recursive call: move n-1 blocks from src to helper using dest
        print(n - 1, src, dest, helper);

        // Print the step of moving the nth block from src to dest
        System.out.println("Move block " + n + " from " + src + " to " + dest);
        // Recursive call: move n-1 blocks from helper to dest using src
        print(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 4; // Number of blocks
        print(n, "s", "h", "d");
    }
}