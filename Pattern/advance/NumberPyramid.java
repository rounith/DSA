package Pattern.advance;

public class NumberPyramid {
    public static void main(String[] args) {
        int rows=5;
        for(int i=rows;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=rows-i;j++){
                System.out.print(rows-i+1+" ");
            }
            System.out.println();
        }
    }
}
