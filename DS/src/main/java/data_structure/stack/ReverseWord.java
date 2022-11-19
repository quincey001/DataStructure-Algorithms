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
    public static void main(String[] args){
        ReverseWord rw = new ReverseWord();
        StringBuffer str = new StringBuffer("abcdefghijk");
        System.out.println(rw.Reverse1(str));
        StringBuffer sb = new StringBuffer("yaffewfewfe");
        System.out.println(rw.Reverse2(sb));
    }
}
