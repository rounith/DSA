package BinarySearch; 
public class scrap {
    class Solution {
        public static void main(String[] args) {
            int[] arr={1,3};
            int target = 3;
            System.out.println(search(arr,target));
        }
        static int search(int[] nums, int target) {
            int start=0,end=nums.length-1;
            int peak=nums.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(mid<end && nums[mid]>nums[mid+1])
                peak=mid;
                if(mid>start && nums[mid]<nums[mid-1])
                peak=mid-1;
                if(nums[mid]<nums[start])
                end=mid-1;
                else
                start=mid+1;
            }
            System.out.println(nums[peak]);
            if(target>=nums[0] && target<=nums[peak]){
                start=0;
                end=peak;
                while(start<=end){
                    int mid=start+(end-start)/2;
                    if(nums[mid]==target)
                    return mid;
                    if(target>nums[mid])
                    start=mid+1;
                    else
                    end=mid-1;
                }
            }
            else{
                start=peak+1;
                end=nums.length-1;
                while(start<=end){
                    int mid=start+(end-start)/2;
                    if(nums[mid]==target)
                    return mid;
                    if(target>nums[mid])
                    start=mid+1;
                    else
                    end=mid-1;
                }
            }
            return -1;
        }
    }
    
}
