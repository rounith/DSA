package general;

public class SquareRoot {
    public static void main(String[] args) {
        int n=10;
        int temp=1;
        int count=0;
        for(int i=n;i>0;i=n){
            n=n-temp;
            temp=temp+2;
            count++;
            System.out.println(count);
        }
        //Math.sqrt(n);
        System.out.println(count);
    }
}
