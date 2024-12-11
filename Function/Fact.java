package Function;

public class Fact {
    public static void fact(int n,int x) {
         if(n==0){
            System.out.println(x);
            return;
         }
         x=n*x;
         fact(n-1,x);
         

    }
    public static void main(String[] args) {
        int n=4;
        fact(n,1);
    }
}
