
public class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        if (null == nums) {
            return 0;
        }
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }

        max = count > max ? count : max;
        return max;
    }

}