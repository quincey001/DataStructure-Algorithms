package algorithms;

public class SelectionSort {
    int[] sort(int [] arr){
        int len = arr.length;
        for(int i = 0; i < len - 1; i++){
            int min_index = i;
            for(int j = i + 1; j < len; j++)
            {
                if(arr[j] < arr[min_index])
                {
                    min_index = j;
                }
            }
            int tem = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = tem;
        }
        return arr;
    }
    void printArray(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{64,25,12,22,11};
        SelectionSort s = new SelectionSort();
        int[] sortedArray = s.sort(arr);
        s.printArray(sortedArray);
    }
}
