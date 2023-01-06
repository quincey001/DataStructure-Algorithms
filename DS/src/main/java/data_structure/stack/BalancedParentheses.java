package data_structure.stack;

import java.util.Stack;

public class BalancedParentheses {
    private static char[][] token = {{'{','}'},{'[',']'},{'(',')'}};
    public boolean isOpenTerm(char openTerm){
        for(int i = 0; i < token.length; i++){
            if(token[i][0] == openTerm){
                return true;
            }
        }
        return false;
    }
    public boolean isMatched(char openTerm, char closeTerm){
        for(int i = 0; i < token.length; i++){
            if(token[i][0] == openTerm){
                return token[i][1] == closeTerm;
            }
        }
        return false;
    }

    public boolean isBalancedParen(String expression){
        // give a stack to store the symbols
        java.util.Stack<Character> stack = new Stack<>();
        char[] exp_arr = expression.toCharArray();

        for(char e : exp_arr){
            if(isOpenTerm(e)){
                stack.push(e);
            }else{
                if(stack.isEmpty() || !isMatched(stack.pop(), e)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
