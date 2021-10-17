class ReverseString {

    static String reverse(String inputString) {
        char[] ch = inputString.toCharArray();
        int i = 0;
        int j = inputString.length()-1;
        while(i<j){
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(ch));
        return inputString = String.valueOf(ch);
    }
  
}
