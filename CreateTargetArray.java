public class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        for (int k = 0; k < nums.length; k++) {
            result[k] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (result[index[i]] == -1) {
                result[index[i]] = nums[i];
            } else {
                int temp = nums[i];
                for (int j = i; j > index[i]; j--) {
                    result[j] = result[j - 1];
                }
                result[index[i]] = temp;
            }
        }
        return result;
    }
}
