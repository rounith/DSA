package Pattern.easy;

public class Triangle01 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}

        /* int rows=5;
        int count=1;
        for(int i=0;i<rows;i++){
            if(i%2==0){
                count=1;
            }
            for(int j=0;j<=i;j++){
                if(count==0)
                System.out.print(count++ +" ");
                else{
                    System.out.print(count-- + " ");
                }
            }
            System.out.println();
        } */
