public class CountPoints {
    public static int countPoints(String rings) {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            boolean isRed = false;
            boolean isGreen = false;
            boolean isBlue = false;
            for (int j = 1; j < rings.length(); j += 2) {
                if (Character.getNumericValue(rings.charAt(j)) == i) {
                    if (rings.charAt(j - 1) == 'R') {
                        isRed = true;
                    } else if (rings.charAt(j - 1) == 'G') {
                        isGreen = true;
                    } else if (rings.charAt(j - 1) == 'B') {
                        isBlue = true;
                    }
                }

            }
            if (isBlue && isGreen && isRed) {
                result++;
            }
        }
        return result;
    }
}
