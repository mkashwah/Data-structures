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
        len = 0;            //variable contains length of the array
        data = new int[0];     //new array with length of 0
    }

    //get(int index)
    public int get(int index){
        return this.data[index];
    }

    //push(int value)
    public void push(int val){
        //create a new temp array with length +1 than data
        int[] temp = new int[this.getLen()+1];

        //copy all elements into a temporary array (because arrays are immutable in java)
        for(int i = 0; i < this.getLen(); i++){
            temp[i]= data[i];
        }
        //push val to the end of the new block in the temp array
        temp[this.getLen()] = val;

        //change reference of data array to temp
        data = temp;

        //increase length
        len++;
    }


    //pop() functions.. removes last element data[data.length - 1] and reduces len by -1
    public void pop(){
        //create a new temp array with length -1 than data
        int[] temp = new int[this.getLen()-1];
        int itemPopped = data[this.getLen() - 1];
        //copy all elements into a temporary array (because arrays are immutable in java) not including the last element
        for(int i = 0; i < this.getLen()-1; i++){
            temp[i]= data[i];
        }
        //print statement for the popped item
        System.out.println("item of index " + (this.getLen()-1) +" = " + get(this.getLen()-1) + " was popped");

        //change reference of data array to the new temp array
        data = temp;

        //decrease length
        len--;
    }

    /** This function is used to delete an element of a dynamic array
     * @param index the index of the deleted array element
     * @return Nothing
     */
    public void delete(int index){
        //create a new temp array with length -1 than data
        int[] temp = new int[this.getLen()-1];

        //create 2 loops that copy the array data[] and doesn't copy the data[index] into temp[]
        for(int i = 0; i < index; i++){
            temp[i] = data[i];
        }
        for(int i = index + 1 ; i < this.getLen(); i++){
            temp[i-1] = data[i];
        }

        //reference data to temp
        data = temp;

        //decrease length
        len--;

    }


    /**This method is used to print the elements of the array
     *
     * @return A print statement with the elements of the array
     */
    public void printArray(){
        String arry = "the elements of this array are {";
        for (int i = 0; i<this.getLen(); i++){
            arry += get(i) + " ";
        }
        arry += "}";
        System.out.println(arry);
    }


    //return length function
    public int getLen() {
        return len;
    }





    public static void main(String[] args){
        //Testing the string reverser
        String sentence = "Hello World!";
        System.out.println(reverseString(sentence));
        //////////////////////////////





        dynamicArrays arr1 = new dynamicArrays();
        arr1.push(10);
        arr1.push(20);
        arr1.push(30);
        System.out.println("length of the array = " + arr1.getLen());
        arr1.printArray();
        arr1.pop();
        arr1.pop();
        System.out.println("length of the array = " + arr1.getLen());
        arr1.printArray();

        System.out.println("testing deleting:::::");
        arr1.push(7);
        arr1.push(14);
        arr1.push(21);
        arr1.push(27);
        System.out.println("length of the array = " + arr1.getLen());
        arr1.printArray();
        arr1.delete(1);
        System.out.println("length of the array = " + arr1.getLen());
        arr1.printArray();
        arr1.delete(0);
        System.out.println("length of the array = " + arr1.getLen());
        arr1.printArray();



//        System.out.println(arr1.data);

        //System.out.println(arr1.get(0));



    }
}
