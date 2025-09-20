package general;

public class Armstrong {
    public static void main(String[] args){
        int n= 12;
        int temp=n;
        int k=n;
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }

        int revNum=0;
        
        while(k>0){
            int last = k%10;
            int last1=1;
            for(int i=0;i<count;i++)
            last1=last1*last;
            revNum=revNum+last1;
            k=k/10;
        }
        if(n==revNum)
        System.out.println(true);
        else
        System.out.println(false);
    }
}
