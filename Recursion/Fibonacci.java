package Recursion;

public class Fibonacci {
    public static void print(int x,int y,int num){
        if(num==0)
        return;
        System.out.println(x+y);
        print(y, x+y, num-1);        
    }
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        int num=7;
        print(0,1,num-2);
    }
}
