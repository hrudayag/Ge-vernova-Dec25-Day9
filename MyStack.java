import java.util.LinkedList;
public class MyStack<T> {
    private LinkedList<T> stack;
    public MyStack() {
        stack = new LinkedList<>();
    }
    public void push(T item) {
        stack.addFirst(item);
    }
    public void printStack() {
        System.out.println("Stack elements (Top to Bottom):");
        for (T item : stack) {
            System.out.println(item);
        }
    }
    //uc1
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.printStack();
    }
}