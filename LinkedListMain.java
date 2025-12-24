public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.append(new MyNode(56));
        list.append(new MyNode(30));
        list.append(new MyNode(70));

        list.popLast();
        list.printList();
    }
}