package general;
import java.util.*;
public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1 to exit");
        int countp=0,countn=0,countz=0;
        int input=sc.nextInt();
        while(input!=1){
            input=sc.nextInt();
            if(input>0)
            countp++;
            if(input<0)
            countn++;
            if(input==0)
            countz++;
        }  
        System.out.println(countp+" "+countn+" "+countz);  
    }
    
}
