package Pattern.easy;

public class HollowRectangle {
    public static void main(String[] args) {
        int rows=4;
        int cols=5;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0 || i== rows-1)
                {
                    System.out.print("*");
                }
                else if(j==0 || j==cols-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
