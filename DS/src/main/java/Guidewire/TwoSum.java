package Guidewire;

import java.util.HashMap;

public class TwoSum {
    public static int[] findPair(int[] numbers, int sum) {
        for(int i = 0; i < numbers.length - 1; i++){
            int firstNum = numbers[i];
            for(int j = i + 1; j < numbers.length; j++){
                int secondNum = numbers[j];
                if(firstNum + secondNum == sum){
                    return new int[]{firstNum, secondNum};
                }
            }
        }
        return new int[]{0,0};
    }
    public static int[] twoSum(int[] numbers, int sum){
        HashMap<Integer, Integer> results = new HashMap<>();
        // key : complement value   value: current index
        for(int i = 0; i < numbers.length; i ++){
            int complement = sum - numbers[i];
            if(results.containsKey(complement)){
                return new int[]{results.get(complement), i};
            }
            results.put(numbers[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,6,5,7};

        int[] results = twoSum(nums, 8);
        for(int i : results){
            System.out.println(i);
        }
        System.out.println(twoSum(nums, 8));
    }
}
