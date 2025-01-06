package BinarySearch.TwoD;

public class Search {
    public static void main(String[] args) {
        int[][] arr={{1,3,5,5},{7,8,10},{12,16,19},{12,43,2}};
        System.out.println(search(arr,19));
    }
    static String search(int[][] matrix    ,int target){
        for(int i=0;i<matrix.length;i++){
            if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]){
                int start=0,end=matrix[i].length-1;
                while(start<=end){
                    int mid=start+(end-start)/2;
                    if(matrix[i][mid]==target)
                    return "["+i+","+mid+"]";
                    if(matrix[i][mid]>target)
                    end=mid-1;
                    else
                    start=mid+1;
                }
            }
        }
        return "false";
    }
}
