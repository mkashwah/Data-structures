import java.util.Arrays;
import java.util.ArrayList;
public class hashTables {

    //array of arraylists holds list of phoneEntry objects
    //the size of this array is equal to the size of the hash table as each hash is connected to an arraylist that contain
    //phoneEntry objects
    private ArrayList<phoneEntry>[] phoneBook;


    public hashTables(int size){
        phoneBook = new ArrayList[size];
    }

    /** This function is the hash creator function. It is a simple function created for the purpose of demoing what hash function are
     *
     * @param name ==> This is the 'key' to be stored in the hash table
     * @return hash
     */
    private int hash(String name){
        int hash = 0;

        //this loop returns the sum of the unicodes to all the letters in the given name
        for (int i = 0; i < name.length(); i++){
            hash = (hash + name.codePointAt(i) * i) % this.phoneBook.length;

        }


    return hash;
    }




    public static void main(String[] args) {




    }
}
