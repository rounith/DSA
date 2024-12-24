package LinearSearch;

public class MaxinTwoD {
    public static void main(String[] args) {
        int[][] arr={{60,89,43,8},{99,7,3,87}};
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
