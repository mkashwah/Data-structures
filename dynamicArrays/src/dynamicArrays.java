import java.util.Arrays;
public class dynamicArrays extends reverseString {
    private int len;
    int[] data;

    //The following functions are needed to work with an array
    //for this example i will be using an array of integers
    //the functions we need are as follows:
    //push(int value)
    //pop()
    //insert(int index, int value)
    //delete(int index)
    //shiftItems(int index)
    //get(int index)

    //constructor
    public dynamicArrays(){
        len = 0;
        data = new int[0];
        System.out.println("array created");
    }

    //get(int index)
    public int get(int index){
        return this.data[index];
    }

    //push(int value)
    public void push(int val){
        int[] temp = new int[data.length+1];
        for(int i = 0; i <= data.length; i++){
            temp[i]= data[i];
        }
        temp[data.length + 1] = val;
        data = temp;
        len++;
    }



    public static void main(String[] args){
        //Testing the string reverser
        String sentence = "Hello World!";
        System.out.println(reverseString(sentence));
        //////////////////////////////





        dynamicArrays arr1 = new dynamicArrays();
        System.out.println(arr1.data.length);
//        System.out.println(arr1.data);
        //arr1.push(5);


        //System.out.println(arr1.get(0));



    }
}
