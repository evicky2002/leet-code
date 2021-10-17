public static int[] runningSum(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                nums[i] = nums[i] + nums[j];
            }
        }
        return nums;
    }