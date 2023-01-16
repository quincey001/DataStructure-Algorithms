package Guidewire;

public class StringInsertA {
    public String solve(String s){
        StringBuilder sb = new StringBuilder(s);
        int countA = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'a') {
                countA++;
                if (s.charAt(i+1) != 'a' && countA < 2) {
                    sb.insert(i+1, 'a');
                    countA ++;
                }
            } else {
                if(s.charAt(i+1) != 'a' ){
                    sb.insert(i+countA, "aa");
                    countA += 2;
                }else {
                    countA = 0;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        StringInsertA stringOne = new StringInsertA();
        System.out.println(stringOne.solve("aababaahhhaa"));
    }
}
