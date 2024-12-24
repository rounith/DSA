package LinearSearch;

public class LC1295 {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        int count=0;
        for(int i=0;i<nums.length;i++){
            int n=len(nums[i]);
            if(n%2==0)
            count++;
        }
            System.out.println(count);;
        }
        public static int len(int a){
            // int count=0;
            // while(a>0){
            //     a/=10;
            //     count++;
            // }
            // return count;
            return (int)(Math.log10(a)+1);
        }
} 
