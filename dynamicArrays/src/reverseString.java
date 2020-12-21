/*String Reverser with complexity O(n)*/

public class reverseString {
    private static String[] str;

    public static String[] reverseString(String strr){
        String[] strCopy = new String[strr.length];
        str = strr;
        for (int i = 0; i < strr.length; i++){
                strCopy [strr.length - 1 - i] = strr[i];

        }

        return strCopy;
    }
}
