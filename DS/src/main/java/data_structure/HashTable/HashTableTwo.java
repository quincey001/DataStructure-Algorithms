package data_structure.HashTable;

import java.util.LinkedList;

public class HashTableTwo {
    LinkedList<Entry>[] map;
    public static int SIZE = 769;

    public HashTableTwo(){
        map = new LinkedList[SIZE];
    }
    public void put(int key, int value){
        int bucket = key % SIZE;
        if(map[bucket] == null){
            map[bucket] = new LinkedList<Entry>();
            map[bucket].add(new Entry(key, value));
        }else{
            // check if the key is present in the bucket
            for(Entry entry : map[bucket]){
                // if key is present, override the value
                if(entry.key == key){
                    entry.value = value;
                    return;
                }
            }
            //if key is not present, create a new entry
            map[bucket].add(new Entry(key, value));
            
        }
    }
    public void remove(int key){
        int bucket = key % SIZE;
        Entry toRemove = null;
        if(map[bucket] == null) return;
        else{
            for(Entry entry : map[bucket]){
                if(entry.key == key){
                    toRemove = entry;
                }
            }
            if(toRemove == null) return;
            map[bucket].remove(toRemove);
        }
    }
    // return the value to which the specified key is mapped, or -1 if this map contains no mapping
    public int get(int key){
        int bucket = key % SIZE;
        LinkedList<Entry> entries = map[bucket];
        if(entries == null) return -1;
        for(Entry entry : entries){
            if(entry.key == key){
                return entry.value;
            }
        }
        return -1;
    }
    // removes the mapping of specific value key if this map contains a mapping for
}
class Entry{
    public int key;
    public int value;
    public Entry(int key, int value){
        this.key = key;
        this.value = value;
    }
}