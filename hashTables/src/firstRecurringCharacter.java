import java.util.HashMap;
public class firstRecurringCharacter {
    private HashMap<Integer, Integer> table;
    private int recurring;


    public firstRecurringCharacter(){

    }

    /** This is a method to find first recurring character in an array
     * for example: in an array [5,2,4,2,6,4]
     * it should return 2
     *
     * @param array int[] array of the numbers to be checked
     * @return the first recurring character
     */
    public Integer firstRecurring(int[] array){
        table = new HashMap<Integer, Integer>();
        if(array == null || array.length == 0){     //check if the array is empty
            System.out.println("Array is empty");
            System.exit(-1);
        }else if(array != null && array.length !=0){        //if the array is not empty
            for (int i = 0; i < array.length; i++){
                if (table.containsKey(array[i]) == false){         //when the key doesn't exist pass this int to the table
                    table.put(array[i], 1);                         //key = array[i]
                }else if (table.containsKey(array[i]) == true) {
                    recurring = array[i];                           //if the key was found to exist table.containsKey(array[i]) == true
                    return recurring;
                }
                }
            }

        return null;
    }

    }

//    public int getRecurring() {
//        return recurring;
//    }

