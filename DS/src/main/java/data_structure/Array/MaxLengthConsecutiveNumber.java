package data_structure.Array;
import java.util.*;
import data_structure.stack.Stack;

public class MaxLengthConsecutiveNumber {
    /**
     *
     * [1,0,7,7,7,7,7,7,1,1,3,4,5,5,5,6,6]
     * print the maximum consecutive number
     */
    public int maxConsecutiveLen(int [] array){
        int count = 1;
        int max = 0;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] == array[i+1]){
                count++;
            }else{
                count = 1;
            }
            max = Math.max(count, max);
        }
        return max;
    }

    /**
     *  return the element that has the longest consecutive number
     */
    public int findLonConsecutiveNum(int[] array){
        //use the
        HashMap<Integer, Integer> store = new HashMap<Integer, Integer>();

        int count = 1;
        int max = 0;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] == array[i+1]){
                count++;
            }else{
                count = 1;
            }
            max = Math.max(count, max);
            store.put(max, array[i]);
        }
        int maxKey = 0;
        for(Integer m : store.keySet()){
            if(m > maxKey){
                maxKey = m;
            }
        }
        return store.get(maxKey);
    }
    public static void main(String[] args){
        MaxLengthConsecutiveNumber m = new MaxLengthConsecutiveNumber();

        int[] array = {1,0,7,7,7,7,7,7,1,1,3,4,5,5,5,6,6};
        System.out.println(m.maxConsecutiveLen(array));
//        System.out.println(m.findLonConsecutiveNum(array));
    }
}
