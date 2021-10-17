import java.lang.String;
class Solution {
    public int romanToInt(String s) {
        int i, result = 0;
        for(i=s.length()-1;i>=0;i--) {
            char ch = s.charAt(i);
            if (ch == 'I') {

                result += 1;
            }
            if (ch == 'V') {
                if(i>0){
                    if(s.charAt(i-1)=='I'){
                        result -=2;
                    }
                }
                result += 5;
            }
            if (ch == 'X') {
                if(i>0){
                    if(s.charAt(i-1)=='I'){
                        result -=2;
                    }
                }
                result += 10;
            }
            if (ch == 'L') {
                if(i>0){
                    if(s.charAt(i-1)=='X'){
                        result -=20;
                    }
                }
                result += 50;
            }
            if (ch == 'C') {
                if(i>0){
                    if(s.charAt(i-1)=='X'){
                        result -=20;
                    }
                }
                result += 100;
            }
            if (ch == 'D') {
                if(i>0){
                    if(s.charAt(i-1)=='C'){
                        result -=200;
                    }
                }
                result += 500;
            }
            if (ch == 'M') {
                if(i>0){
                    if(s.charAt(i-1)=='C'){
                        result -=200;
                    }
                }
                result += 1000;
            }
        }
    return result;
    }
}