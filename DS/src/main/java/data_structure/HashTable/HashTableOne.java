package data_structure.HashTable;

public class HashTableOne {
    /**
     * hash table is a structure that can map keys to values, and a hash table uses a hash
     * function to compute an index into an array of buckets from which the desired value can
     * be found.
     * hash table is efficient for both finding an item and adding an item, as they have an
     * average o(1) time complexity for these operations.
     *
     * it used for associative arrays, database indexing, caches, and sets.
     */
    private HashNode[] buckets;
    private int numberOfBuckets;//capacity of hashtable
    private int size; // the number of key value pairs
    public HashTableOne(){
        this(20);
    }

    public HashTableOne(int capacity) {
        this.numberOfBuckets = capacity;
        this.buckets = new HashNode[numberOfBuckets];
        this.size = 0;
    }
    // get the number of key value pairs
    public int getSize(){
        return size;
    }
    // check if the hashtable is empty
    public boolean isEmpty(){
        return size == 0;
    }
    // insert operation
    public void insert(Integer key, String value){

    }
    // get operation
    public String getValue(Integer key){
        return "";
    }
    //remove operation
    public String removeValue(Integer key){
        return "";
    }

    public class HashNode{
        private Integer key;
        private String value;
        private HashNode next;
        public HashNode(Integer key, String value){
            this.key = key;
            this.value = value;
        }
    }

}
