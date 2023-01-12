package Guidewire;

import java.util.Arrays;

public class SortArray {

    // 12345
    public int[] sort(int[] arr){
        Arrays.sort(arr);
        int[] newArray = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            newArray[j] = arr[i];
            newArray[i] = arr[j];
            i++;
            j--;
        }
        return newArray;
    }
    public void display(int[] array){
        for(int i : array){
            System.out.println(i);
        }
    }
    // 1 3 2 4 5
    // 5 > 1 < 4 > 2 < 3
    public static void main(String[] args){
        int[] array = {1,3,2,4,5};
        SortArray sortArray = new SortArray();
        sortArray.display(sortArray.sort(array));
    }
}
