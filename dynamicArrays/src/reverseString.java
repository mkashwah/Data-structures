import java.util.Arrays;

/*String Reverser with complexity O(n)*/

public class reverseString {
    private static String str;
    private static char ch;
    public static String[] reverseString(String strr){
        String[] strCopy = new String[strr.length()];
        str = strr;
        for (int i = 0; i < strr.length(); i++){
                ch = strr.charAt(i);
                strCopy [strr.length() - 1 - i] = String.valueOf(ch);

        }

        return strCopy;
    }
}
