public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        boolean result = true;
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            int character = (int) s.charAt(i);
            if (character >= 65 && character <= 90) {
                character += 32;
                temp += (char) character;
            } else if (character >= 48 && character <= 57) {
                temp += (char) character;
            } else if (character >= 97 && character <= 122) {
                temp += (char) character;
            }
        }
        int startPointer = 0;
        int endPointer = temp.length() - 1;
        while (startPointer <= endPointer) {
            if (temp.charAt(startPointer) != temp.charAt(endPointer)) {
                result = false;
                break;
            }
            startPointer += 1;
            endPointer -= 1;
        }
        return result;
    }
}
