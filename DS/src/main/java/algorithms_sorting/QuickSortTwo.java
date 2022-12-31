package algorithms_sorting;

public class QuickSortTwo {
    static int partition(int[] array, int start, int end){
        int pivot = end;
        int i = start - 1;
        for(int j = 0; j <= end; j++){
            if(array[j] <= array[pivot]){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return i;
    }
    public static void quickSort(int[] arrary, int start, int end){
        if(start < end){
            int pivot = partition(arrary, start, end);
            quickSort(arrary, start, pivot - 1);
            quickSort(arrary, pivot - 1, end);
        }
    }
    public static void main(String[] args){
        int array[] = {10,3,2,7,7,5,8,4,1,2,9,7,8,11};
        quickSort(array, 0, array.length - 1);
    }
}
