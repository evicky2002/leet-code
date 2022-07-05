public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            String temp = t;
            boolean result = false;
            for (int i = 0; i < s.length(); i++) {
                char curCharacter = s.charAt(i);
                for (int j = 0; j < temp.length(); j++) {
                    System.out.println(curCharacter);
                    System.out.println(temp.charAt(j));

                    if (curCharacter == temp.charAt(j)) {
                        String temp1;
                        result = true;
                        temp1 = temp.substring(0, j) + temp.substring(j + 1, temp.length());
                        System.out.println(temp1);
                        temp = temp1;
                        break;
                    } else {
                        result = false;
                    }
                }
                if (!result) {
                    break;
                }
            }
            return result;
        } else {
            return false;
        }

    }

}
