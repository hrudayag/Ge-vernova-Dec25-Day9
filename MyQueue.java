import java.util.LinkedList;
public class MyQueue<T> {
    private LinkedList<T> queue;
    public MyQueue() {
        queue = new LinkedList<>();
    }
    public void enqueue(T item) {
        queue.addLast(item);
    }
    public void printQueue() {
        System.out.println("Queue elements (Front to Rear):");
        for (T item : queue) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        queue.printQueue();
    }
}