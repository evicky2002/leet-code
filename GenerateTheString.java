public class GenerateTheString {
    public static String generateTheString(int n) {
        String result = "";
        if (n % 2 == 1) {
            result += "a".repeat(n);
        } else {
            result += "a".repeat(n - 1);
            result += "b";
        }
        return result;
    }
}
