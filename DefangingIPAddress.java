public class DefangingIPAddress {
    public String defangIPaddr(String address) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArray = address.split("\\.");
        for (int i = 0; i < strArray.length; i++) {
            stringBuffer.append(strArray[i]);
            if (i < strArray.length - 1) {
                stringBuffer.append("[.]");
            }
        }
        // StringTokenizer stringTokenizer = new StringTokenizer(address, ".");
        // StringBuffer stringBuffer = new StringBuffer();
        // while (stringTokenizer.hasMoreTokens()) {
        // stringBuffer.append(stringTokenizer.nextToken());
        // if(stringTokenizer.hasMoreTokens()){
        // stringBuffer.append("[.]");
        // }
        // }
        // return stringBuffer.toString();
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        DefangingIPAddress defangingIPAddress = new DefangingIPAddress();
        System.out.println(defangingIPAddress.defangIPaddr("1.1.1.1"));
    }
}
