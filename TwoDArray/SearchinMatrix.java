package TwoDArray;
import java.util.*;
public class SearchinMatrix {
    public static void main(String[] args) {
        int[][] arr=new int[3][2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int num=9;
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                if(arr[i][j]==num)
                System.out.println(i+" "+j);
            }
        }
    }
    
}
