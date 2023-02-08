package Sig;

public class BinaryStringAddition{
    public static String add(String a, String b) {
        int n = Math.max(a.length(), b.length());
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < n; i++) {
            int numA = i < a.length() ? a.charAt(i) - '0' : 0;
            int numB = i < b.length() ? b.charAt(i) - '0' : 0;
            int sum = numA + numB + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        String a = "1000";
        String b = "111";
        System.out.println(add(a,b));
    }

}

