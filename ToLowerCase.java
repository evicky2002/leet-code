public class ToLowerCase {
    public String toLowerCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int currCharacter = (int) s.charAt(i);
            if (currCharacter >= 65 && currCharacter <= 90) {
                currCharacter += 32;
                result += (char) currCharacter;
            } else {
                result += (char) currCharacter;
            }
        }
        return result;
    }
}
