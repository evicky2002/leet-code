
import java.util.*;

class Solution {
    public static List<List<Integer>> pTriangle1(int rows) {

        int[][] result = new int[rows][];
        for (int i = 0; i < rows; i++) {
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

        List<List<Integer>> submission = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < result[i].length; j++) {
                temp.add(result[i][j]);
            }
            submission.add(temp);
        }

        return submission;

    }
}