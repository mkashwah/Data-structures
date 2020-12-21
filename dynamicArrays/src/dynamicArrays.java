import java.util.Arrays;
public class dynamicArrays extends reverseString {
    private int length;
    private int[] data = {};

    //constructor
    public void dynamicArrays(){
        int[] data = new int[2];
        length = 0;
    }


    public static void main(String[] args){
        //Testing the string reverser
        String sentence = new String[];
        sentence = "Hello World!";
        System.out.println(reverseString(sentence));



        dynamicArrays arr1 = new dynamicArrays();
        arr1.length = 1;
        int dat[] = new int[2];
        dat[0] = 10;
//        arr1.data[0] = 5;
//        arr1.data[1] = 10;
        System.out.println(arr1.data.length);
        System.out.println(dat.length);


    }
}
