package algorithms_searching;

public class LinearSearch {
    public static int linearSearch(int[] arr, int num){
        int index = -1;
        for(int i : arr){
            index++;
            if(i == num){
                return index;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,55,5,6,7,8,222,20};
        System.out.println(linearSearch(arr, 5));
    }
}
