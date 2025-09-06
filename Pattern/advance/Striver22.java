package Pattern.advance;
//USe top,bottom,left,right and then take min of it and minus with n to get the actual
//value in that place
public class Striver22 {
    public static void main(String args[]){
        int n=4;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int bottom= (2*n - 2)-i;
                int left=j;
                int right = (2*n - 2)-j;
                System.out.print(n - Math.min(Math.min(left,right),Math.min(top,bottom)));
            }
            System.out.println();
        }
    }

    
}
