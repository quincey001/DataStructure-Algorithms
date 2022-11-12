package data_structure.tree;

public class Node {
    Node left, right;
    int value;
    public Node(int value){
        this.value = value;
        right = null;
        left = null;
    }
    public void insert(int value){
        if(value <= value){
            if(left == null){
                left = new Node(value);
            }else {
                left.insert(value);
            }
        }else {
            if(right == null){
                right = new Node(value);
            }else {
                right.insert(value);
            }
        }
    }
    public boolean contains(int value){
        if(value == value){
            return true;
        }else if(value < value){
            if(left == null){
                return false;
            }else {
                return left.contains(value);
            }
        }else {
            if(right == null){
                return false;
            }else {
                return right.contains(value);
            }
        }
    }
    public void printInOrder(){
        if(left != null){
           left.printInOrder();
        }
        System.out.println(value);
        if(right != null){
            right.printInOrder();
        }
    }

    public static void main(String[] args){

    }
}
