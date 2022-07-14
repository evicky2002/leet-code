public class SearchSortedArray {
    public int search(int[] nums, int target) {
        int match = -99999;
        int result = -1;
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        int[] workingArray = new int[nums.length];
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i] - nums[i + 1];
            if (temp > max) {
                max = temp;
                maxIndex = i + 1;
            }
        }

        int pointer = 0;
        for (int j = maxIndex; j < nums.length; j++) {
            workingArray[pointer] = nums[j];
            pointer++;
        }
        for (int j = 0; j < maxIndex; j++) {
            workingArray[pointer] = nums[j];
            pointer++;
        }
        int lowerBound = 0;
        int upperBound = workingArray.length - 1;
        while (lowerBound <= upperBound) {
            int mid = (lowerBound + upperBound) / 2;
            if (workingArray[mid] == target) {
                match = workingArray[mid];
                break;
            } else if (workingArray[mid] < target) {
                lowerBound = mid + 1;
            } else if (workingArray[mid] > target) {
                upperBound = mid - 1;
            }
        }
        if (match != -99999) {
            for (int p = 0; p < nums.length; p++) {
                if (nums[p] == match) {
                    result = p;
                    break;
                }
            }
        }

        return result;
    }
}
