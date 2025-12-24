import java.util.LinkedList;
public class MyStack<T> {
    private LinkedList<T> stack;
    public MyStack() {
        stack = new LinkedList<>();
    }
    public void push(T item) {
        stack.addFirst(item); // LinkedList add method
    }
    public T peek() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.getFirst();
    }
    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.removeFirst();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public void printStack() {
        System.out.println("Stack elements (Top to Bottom):");
        for (T item : stack) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.printStack();
        System.out.println("\nPeek element: " + stack.peek());
        System.out.println("\nPopping elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}