package data_structure.stack;

public class ReverseWord {
    private StringBuffer Reverse1(StringBuffer s){
        Stack stack = new Stack(s.length());
        for(int i = 0; i < s.length(); i++){
            stack.push(s.charAt(i));
        }
        for(int i = 0; i < s.length(); i++){
            char a = (char) stack.pop();
            s.setCharAt(i, a);
        }
        return s;
    }

    private StringBuffer Reverse2(StringBuffer s){
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char a = s.charAt(left), b = s.charAt(right);
            s.setCharAt(right, a);
            s.setCharAt(left, b);
            left++;
            right--;
        }
        return s;
    }

    private String reverseString(String s){
        String string = "";
        for(int i = s.length() - 1; i >= 0; i--){
            string += s.charAt(i);
        }
        return string;

    }
    private String reverseString1(String s){
        int len = s.length();
        int j = s.length()-1;
        char[] arr = new char[len];
        for(int i = 0; i < len; i++){
            arr[j] = s.charAt(i);
            j--;
        }
        String str = new String(arr);
        return str;
    }

    public static void main(String[] args){
        ReverseWord rw = new ReverseWord();

        StringBuffer str = new StringBuffer("abcdefghijk");
        System.out.println(rw.Reverse1(str));
        StringBuffer sb = new StringBuffer("yaffewfewfe");
        System.out.println(rw.Reverse2(sb));
        String s = "abcdefghijklmn";
        System.out.println(rw.reverseString(s));
        System.out.println(rw.reverseString1(s));
    }
}
