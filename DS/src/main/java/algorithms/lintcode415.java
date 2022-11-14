package algorithms;

public class lintcode415 {
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j){
            char a = s.charAt(i), b = s.charAt(j);
            if (!Character.isLetterOrDigit(a)){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(b)){
                j--;
                continue;
            }

            if (a != b){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
