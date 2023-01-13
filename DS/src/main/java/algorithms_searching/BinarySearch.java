package algorithms_searching;

public class BinarySearch {
    /**
     *
     *  time complexity of binary search is log2(n)
     *  at iteration 1: length of the array n = n
     *  at iteration 2: length of the array n = n/2
     *  at iteration 3: length of the array n = (n/2)2
     *  at iteration t: length of the array n = n/(2^t)
     *  when the length is 1, the loop will stop
     *  1 = n/(2^t) ==> 2^t = 1  ==> log2(n) = t
     */
    static int binary(int[] arr, int left, int right, int target){
        if(right >= left){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target)
                return mid;
            if(arr[mid] < target)
                return binary(arr, mid + 1, right, target);
            return binary(arr, left, mid - 1, target);
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array = {2,4,7,8,9,22,33,56,78};
        System.out.println(binary(array,0, array.length - 1, 78 ));
    }
}
