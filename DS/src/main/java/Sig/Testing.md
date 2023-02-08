## 1. get the median in the integer array

```java 
import java.util.Arrays;

class Main {
    public static double getMedian(int[] nums) {
        int median = 0;
        Arrays.sort(nums);
        int len = nums.length;
        int middle1 = array[len/2 - 1];
        int middle2 = array[len/2];
        
        if(len % 2 != 0){
            return nums[nums.length/2];
        }else{ 
            return (double) ((middle2 + middle1)/2);
        }
    }
}
```
## 2. sum up all the possible divisors for an integer n.
```java
class Divisor{
    public static int getDivisors(int n){
        int sum = 0;
        for(int i = 1; i <= n/2; i++){
            if(i % n == 0){
                sum += n;
            }
        }
        sum += n;
        return sum;
    }
}
```

## 3. Binary operation
string a = "1000";
string b = "111";
binary operate string c = "1111";

```java 
class Binary{
    public static String binaryOperate(String a, String b){
        int numberA = Integer.parseInt(a, 2);
        int numberB = Integer.parseInt(b, 2);
        int numberC = numberA | numberB;
        return Integer.toBinaryString(numberC);
    }
}
```