package general;

public class HcfandLcm {
    public static void main(String[] args) {
        int n=8,m=24;
        int temp=0;
        for(int i=1;i<=n;i++){
            if(n%i==0 && m%i==0)
            temp=i;
        }
        System.out.println(temp);
        int lcm=(m*n)/temp;
        System.out.println(lcm);
    } 
}
