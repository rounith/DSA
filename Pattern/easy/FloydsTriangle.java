package Pattern.easy;

public class FloydsTriangle {
    public static void main(String[] args) {
        int rows=5;
        int count=1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
