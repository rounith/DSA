package Pattern.easy;

public class HalfPyramidwithNumbers {
    public static void main(String[] args) {
        int rows=5;
        for(int i=0;i<rows;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
