package Recursion;

public class Ntimes {
    public static void main(String[] args){
        name(5);
    }
     static void name(int n){
        if(n>0)
        {
            System.out.println("Rounith");
            name(n-1);
        }
        else
        return;
    }
}
