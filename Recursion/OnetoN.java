package Recursion;

public class OnetoN {
    public static void main(String[] args){
        printn(5,1);
    }
    static void printn(int n,int x){
        if(x>n)
        return;
        else
        System.out.println(x);
        printn(n,x+1);
    }
}
