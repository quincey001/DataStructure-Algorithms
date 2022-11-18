package algorithms_string;

public class lintcode1790 {
    public String rotateString2(String str, int left, int right) {
        // write your code here
        int start = 0;
        int slen = str.length();
        String rotateStr = "";
        int lmove = left%slen;
        int rmove = right%slen;

        if(lmove == rmove ){
            return str;
        }
        if(lmove > rmove){
            start = lmove - rmove;

        }else if(lmove < rmove){
            start = slen - (rmove - lmove);
        }
        rotateStr = str.substring(start) + str.substring(0, start);


        return rotateStr;
    }
    public static void main(String[] args){
        int left = 400;
        int right = 5419;
        String s = "dtusDOgrWzHmRCGGNsNTEuNp";
        lintcode1790 l =  new lintcode1790();

        System.out.println(l.rotateString2(s, left, right));
    }
}
