package LinearSearch;

public class SearchinTwoD {
    public static void main(String[] args) {
        int target=87;
        int[][] arr={{60,89,43,8},{89,7,3,87}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    System.out.println("At "+(i+1)+","+(j+1));
                    break;
                }
            }
        }

    }
}
