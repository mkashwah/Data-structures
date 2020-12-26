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

    /** This method is the hash creator. It is a simple function created for the purpose of demoing what hash function are
     *
     * @param name ==> This is the 'key' to be stored in the hash table
     * @return hash
     */
    private int hash(String name){
        int hash = 0;

        //this loop returns the sum of the unicodes to all the letters in the given name
        //the hash returned is of the value 0 < hash < size of hashTable
        for (int i = 0; i < name.length(); i++){
            hash = (hash + name.codePointAt(i) * i) % this.phoneBook.length;
        }
    return hash;
    }

    /**This method fills the hashTable
     *
     * @param name Name to be stored
     * @param number associated number
     */
    private void set(String name, int number){
        int tableAddress = hash(name); //get the hash code (tableAddress)

        if(this.phoneBook[tableAddress] == null){
            phoneBook[tableAddress] = new ArrayList<>();
        }

        //create phoneEntry object
        phoneEntry entry = new phoneEntry(name, number);

        //add the created phone entry to the adjacent arraylist
        phoneBook[tableAddress].add(entry);
    }



    public static void main(String[] args) {
       
    }
}
