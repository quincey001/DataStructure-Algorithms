package data_structure.queue;

public class Queue {
    private int[] arr ;
    private int capacity;
    private int front, rear;

    public Queue(int size) {
         arr = new int[size];
         capacity = size;
         front = -1;
         rear = -1;
    }
    public int queueSize(){
        return rear + 1;
    }
    public Boolean isEmpty(){
        return front == -1;
    }
    public Boolean isFull(){
        return front == 0 && rear == capacity - 1;
    }
    public void add(int element){
        if(isFull()){
            System.out.println("queue is full!");
        }else{
            front = 0;
            rear++;
            arr[rear] = element;
            System.out.println("Insert " + element);
        }
    }
    public int remove(){
        int element = 0;
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }else{
            if(front <= rear){
                element = arr[front];
                front++;
            }else{
                front = -1;
                rear = -1;
            }
        }
        System.out.println("Deleted -> " + element);
        return element;
    }
    public static void main(String[] args){
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
    }
}
