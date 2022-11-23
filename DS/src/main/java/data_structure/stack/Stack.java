package data_structure.stack;

public class Stack {
    /**
     * in the stack structure, elements are stored in the LIFO principle, like a stack of books.
     * the last one store in a stack will be removed first.
     */
    private int arr[];
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }
    public int stackSize(){
        return top + 1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity - 1;
    }
    public void push(int element){
        if(isFull()){
            System.out.println("Stack Over Flow");
        }
        System.out.println("Insert " + element);
        arr[++top] = element;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
        }
        return arr[top--];
    }
    public void printStack(){
        for(int i = 0; i <= top; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.printStack();
        char a = 'a';
        char b = 'b';
        System.out.println(a+b);
        /**
         * The most common uses of a stack are:
         * 1 - To reverse a word - Put all the letters in a stack and pop them out.
         *     Because of the LIFO order of stack, you will get the letters in reverse order.
         * 2 - In compilers - Compilers use the stack to calculate the value of expressions like
         *     2 + 4 / 5 * (7 - 9) by converting the expression to prefix or postfix form.
         * 3 - In browsers - The back button in a browser saves all the URLs
         *     you have visited previously in a stack.
         */
    }
}
