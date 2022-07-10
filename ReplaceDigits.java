public class ReplaceDigits {
    public String replaceDigits(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                int character = (int) s.charAt(i - 1);
                int convertedCharacter = character + Character.getNumericValue(s.charAt(i));
                result += (char) convertedCharacter;
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }
}
