package Recursion;

public class SumOfnNaturalNo {
    public static void sum(int n,int x){
        if(n==0){
            System.out.println(x);
            return;
        }
        x=x+n;//
        sum(n-1,x);//
    }
    public static void main(String[] args) {
        sum(5,0);
    }    
}