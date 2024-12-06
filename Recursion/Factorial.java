package Recursion;

public class Factorial {
    public static void fact(int n,int x){
        if(n==1){
            System.out.println(x);
            return;
        }
        x=x*n;
        fact(n-1,x);
    }
    public static void main(String[] args) {
        fact(4,1);
    }
}
