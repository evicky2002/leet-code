import java.util.HashSet;

class Solution {
    public static int uniqueMorseRepresentations(String[] words) {
        int result = 0;
        HashSet<String> morseSet = new HashSet<>();
        String[] morseCodeSet = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String morseWord = "";
            for (int j = 0; j < word.length(); j++) {
                int letter = (int) word.charAt(j);
                morseWord += morseCodeSet[(letter - 97)];
            }
            if(!morseSet.contains(morseWord)){
                morseSet.add(morseWord);
            }
        }
        return morseSet.size();
    }
}