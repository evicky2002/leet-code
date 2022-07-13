public class DiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int result = 0;
        if (mat.length % 2 == 0) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if (i == j) {
                        result += mat[i][j];
                        break;
                    }
                }
            }
            int backwardCounter = mat.length - 1;

            for (int i = 0; i < mat.length; i++) {

                for (int j = mat.length - 1; j >= 0; j--) {
                    if (j == backwardCounter) {
                        result += mat[i][j];
                    }

                }
                backwardCounter--;

            }
        } else {
            int mid = mat.length / 2;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if (i != mid && j != mid) {
                        if (i == j) {
                            result += mat[i][j];
                            break;
                        }
                    }

                }
            }
            int backwardCounter = mat.length - 1;
            for (int i = 0; i < mat.length; i++) {
                for (int j = mat.length - 1; j >= 0; j--) {
                    if (j == backwardCounter) {
                        result += mat[i][j];
                    }
                }
                backwardCounter--;
            }
        }
        return result;
    }
}
