package BinarySearch;
//greatest number in an array
public class PivotBS {
    public static void main(String[] args) {
        int[] arr={4,7,0,1,2,3,4};
        System.out.println(search(arr));
    }
    public static int search(int[] nums) {
        int start = 0;
        int end = nums.length-1;
 
        while(start <= end){
            int mid = (start+end)/2;
            if(mid<end && nums[mid]>nums[mid+1])
            return mid;
            if(mid>start && nums[mid-1]>nums[mid])
            return mid-1;
            if(nums[mid]<=nums[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
