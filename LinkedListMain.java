public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        MyNode node56 = new MyNode(56);
        MyNode node70 = new MyNode(70);
        MyNode node30 = new MyNode(30);

        list.pop();
        list.printList();
    }
}