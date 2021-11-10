public class InsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if(n==1){
            if(nums[0]>=target){
                return 0;
            }else{
                return 1;
            }
        }
        int result=0;
        int lowerBound = 0;
        int upperBound = n-1;
        boolean targetFound = false;

        while(lowerBound<=upperBound){
            int mid = (upperBound+lowerBound)/2;
            if(nums[mid]==target){
                System.out.println("Target found: "+target);
                targetFound = true;
                result = mid;
                break;
            }else if(nums[mid]<target){
                lowerBound = mid+1;
            }else if(nums[mid]>target){
                upperBound = mid-1;
            }
        }
        if(!targetFound){
            System.out.println("Lowerbound: "+lowerBound);
            System.out.println("Upperbound: "+upperBound);
            result = lowerBound;
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = {1,3,5};
        System.out.println(searchInsert(nums,10));
    }
}
