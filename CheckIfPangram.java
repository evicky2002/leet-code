import java.util.HashMap;

public class CheckIfPangram {
    public static boolean checkIfPangram(String sentence) {
        boolean result = false;
        int weight = 0;
        HashMap<Character, Integer> alphaMap = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            char currCharacter = sentence.charAt(i);
            if (!alphaMap.containsKey(currCharacter)) {
                alphaMap.put(currCharacter, i);
                int charWeight = (int) currCharacter;
                weight += charWeight;
            }
        }
        System.out.println("weight : " + weight);
        if (weight == 2847) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}
