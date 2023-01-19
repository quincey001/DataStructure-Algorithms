package data_structure.HashTable;

public class Hashing {
    /**
     * hashing is a method of sorting and indexing data, the idea behind hashing is to allow
     * large amounts of data to be indexed using keys commonly created by formulas.
     *
     * If the array is sorted, the best time complexity for searching a gaven value will be O(logn)
     *
     * In the Linked list, it will perform a linear search, so the time complexity will be O(n)
     *
     * In the tree, the time complexity for searching a value will O(logn), because in this case,
     * it needs to either look in the left child or the right child.
     *
     * when it comes to hashing, in the best case, it takes O(1) if there are less collisions in
     * the search operation.
     *
     *
     *
     * (-----hash function-------)
     * it is a function that can be used to map of arbitrary size to data of fixed size.
     * A hash function is a mathematical function that converts a numerical
     * input value into another compressed numerical value.
     * (-------key-----------)
     * input data by a user
     * (-------hash value-------)
     * a value that is returned by hash function
     * (--------hash table--------)
     * a data structure which implements an associative array abstract data type,
     * a structure that can map keys to values
     * (---------collisions------)
     * a collision occurs when two different keys to a hash function produce the same output.
     *
     */
    // when the user input is a number
    int mod(int number, int cellNumber){
        return number % cellNumber;
    }
    // when the user input is a string
    public int modASCII(String word, int cellNumber){
        int total = 0;
        for(int i = 0; i < word.length(); i++){
            total += word.charAt(i);
        }
        return total % cellNumber;
    }
    /**
     * a good hash function distributes hash values uniformly
     * across hash table.
     */

}
