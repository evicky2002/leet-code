import java.util.*;

class Solution {
    public static List<Integer> pTriangle2(int rowIndex) {
        rowIndex++;
        int[][] result = new int[rowIndex][];

        for (int i = 0; i < rowIndex; i++) {
            int[] temp = new int[i + 1];
            result[i] = temp;
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    result[i][j] = 1;

                } else {
                    result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
                }
            }
            result[i] = temp;

        }

        List<Integer> submission = new ArrayList<>();
        for (int i = 0; i <= result[rowIndex - 1].length - 1; i++) {
            submission.add(result[rowIndex - 1][i]);

        }

        return submission;
    }
}
