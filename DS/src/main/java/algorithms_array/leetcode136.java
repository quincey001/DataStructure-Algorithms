package algorithms_array;

public class leetcode136 {
    /**
     * Given a non-empty array of integers nums, every element appears
     * twice except for one. Find that single one.
     *
     * You must implement a solution with a linear runtime complexity and
     * use only constant extra space.
     * Input: nums = [2,2,1]
     * Output: 1
     */
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i : nums){
            //binary operation
            res ^= i;
//            System.out.println(res);
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,3,2,2,4,3,4};
        leetcode136 l = new leetcode136();
        System.out.println(l.singleNumber(arr));
    }
}
