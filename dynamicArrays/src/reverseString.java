import java.util.Arrays;

/*String Reverser with complexity O(n)*/

public class reverseString {


    private static char[] chs;

    public static String reverseString(String strr){

        chs = new char[strr.length()];          //set the char array with length of strr
        chs = strr.toCharArray();               //convert the string to array of chars and store it in chs
        for(int i = 0; i < strr.length(); i++){
            chs[i] = strr.charAt(strr.length()-1-i);        //reverse the order of strr into chs[]
        }
        String finalString = new String(chs);           //make string from chs[]
        return finalString;
    }
}
