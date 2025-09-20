package Backtracking;

public class First {
    static void printn(int n){
        if(n<1)
        return;
        printn(n+1);
        System.out.println(n);

    }
    public static void main(String[] args){
        printn(3);
    }
    
}
