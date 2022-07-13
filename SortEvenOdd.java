public class SortEvenOdd {
    public int[] sortEvenOdd(int[] nums) {
        boolean oddSwap = false;
        boolean evenSwap = false;
        do {
            evenSwap = false;
            for (int i = 0; i < nums.length - 2; i += 2) {
                if (nums[i] > nums[i + 2]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 2];
                    nums[i + 2] = temp;
                    evenSwap = true;
                }
            }
        } while (evenSwap);

        do {
            oddSwap = false;
            for (int i = 1; i < nums.length - 2; i += 2) {
                if (nums[i] < nums[i + 2]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 2];
                    nums[i + 2] = temp;
                    oddSwap = true;
                }
            }
        } while (oddSwap);

        return nums;
    }
}
