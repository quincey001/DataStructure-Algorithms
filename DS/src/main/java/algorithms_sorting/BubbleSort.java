package algorithms_sorting;

public class BubbleSort {
    /**
     * bubble sort takes n^2 complexity time
     * @param arr
     * @return
     */
    public int[] bubbleSort(int[] arr){
        int len = arr.length;

        for(int i = 0; i < len - 1; i++){
            for(int j = 0; j < len - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
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
        BubbleSort b= new BubbleSort();
        b.bubbleSort(arr);
        b.printArray(arr);
    }
}
