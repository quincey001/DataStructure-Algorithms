package algorithms_sorting;

public class QuickSort {
    /**
     * the average expected time complexity is O(nlongn)
     * @param arr
     * @param i
     * @param j
     */
    static void swap(int[] arr, int i, int j){
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }
    public static void quicksort(int[] array){
        quicksort(array, 0, array.length - 1);
    }
    public static void quicksort(int[] array, int left, int right){
        if(left >= right){
            return;
        }
        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        quicksort(array, left, index - 1);// quick sort left side
        quicksort(array, index, right);//quick sort right side
    }
    static int partition(int[] array, int left, int right, int pivot){
        //pivot
        while(left <= right){
            while(array[left] < pivot){
                left++;
            }
            while(array[right] > pivot){
                right--;
            }
            if(left <= right){
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
    public static void display(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args){

        int[] array = {2,3,8,22,7,9,1,4,20};
        quicksort(array);
        display(array);
    }
}
