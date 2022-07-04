import java.util.HashMap;

class DecodeMessage {
    public static String decodeMessage(String key, String message) {
        String result = "";
        key = key.replaceAll(" ", "");
        HashMap<Integer, Character> alphabetsMap = new HashMap<>();
        HashMap<Character, Integer> keyMap = new HashMap<>();

        alphabetsMap.put(1, 'a');
        alphabetsMap.put(2, 'b');
        alphabetsMap.put(3, 'c');
        alphabetsMap.put(4, 'd');
        alphabetsMap.put(5, 'e');
        alphabetsMap.put(6, 'f');
        alphabetsMap.put(7, 'g');
        alphabetsMap.put(8, 'h');
        alphabetsMap.put(9, 'i');
        alphabetsMap.put(10, 'j');
        alphabetsMap.put(11, 'k');
        alphabetsMap.put(12, 'l');
        alphabetsMap.put(13, 'm');
        alphabetsMap.put(14, 'n');
        alphabetsMap.put(15, 'o');
        alphabetsMap.put(16, 'p');
        alphabetsMap.put(17, 'q');
        alphabetsMap.put(18, 'r');
        alphabetsMap.put(19, 's');
        alphabetsMap.put(20, 't');
        alphabetsMap.put(21, 'u');
        alphabetsMap.put(22, 'v');
        alphabetsMap.put(23, 'w');
        alphabetsMap.put(24, 'x');
        alphabetsMap.put(25, 'y');
        alphabetsMap.put(26, 'z');

        int index = 1;
        for (int k = 0; k < key.length(); k++) {
            if (!keyMap.containsKey(key.charAt(k))) {
                keyMap.put(key.charAt(k), index);
                index += 1;
            }
        }
        System.out.println(keyMap);

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                result += " ";
            } else {
                result += alphabetsMap.get(keyMap.get(message.charAt(i)));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(decodeMessage("eljuxhpwnyrdgtqkviszcfmabo",
                "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }
}