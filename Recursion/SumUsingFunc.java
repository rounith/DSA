package Recursion;

public class SumUsingFunc {
    public static void sumofNum(int n){
        if(n==0){
            System.out.println(x);
            return;
        }
        x=x+n;
        sumofNum(n-1);
    }
    static int x=0;
    public static void main(String[] args){
        sumofNum(3);
    }
    
}
