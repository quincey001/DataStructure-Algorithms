package HackerRank;

public class RemoveDigitsInString {
    public static String removeAllDigit(String str){
        char[] charArray = str.toCharArray();
        String result = "";
        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] != '5'){// remove all digits: !Character.isDigit(charArray[i]) && 
                result += charArray[i];
            }
        }
        return result;
    }
    public static void main(String[] args){
        String str = "gkkea33345556776";
        System.out.println(removeAllDigit(str));
    }
}
