import java.util.Arrays;

/** This class implements a merge and sort algorithm
 */
import java.util.stream.Stream;
public class mergeAndSort {
    private static int[] mergedArray;

    /** Constructor method for the merger&sorter algorithm
     *
     */
    public static int[] mergeAndSort(int[] array1, int[] array2){
        boolean isInt1 = Arrays.stream(array1).allMatch(n-> Integer.class.isInstance(n));
        boolean isInt2 = Arrays.stream(array2).allMatch(n-> Integer.class.isInstance(n));

        //test if array 1 or 2 are of int type and not empty
        if (array1 == null || array2 == null || isInt1 == false || isInt2 == false) {
            System.exit(-1);
        }else{

            //create a merged array for both array 1 and array 2
            int[] merged = new int[array1.length + array2.length];

            //fill out int merged[] with array1[] and array2[]
            for(int i = 0; i< array1.length; i++){
                merged[i] = array1[i];
            }
            for(int i = array1.length; i< array1.length + array2.length; i++){
                merged[i] = array2[i - array1.length];
            }

            int tempInt;

            //Sorting algorithm
            for (int i = 0; i < merged.length; i++){
                for (int j = 0; j < i; j++){
                    if (merged[i] <= merged[j]){
                        tempInt = merged[j];
                        merged[j] = merged[i];
                        merged[i] = tempInt;
                    }
                }
            }
            mergedArray = merged;
        }

        return mergedArray;
    }
}
