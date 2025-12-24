public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        MyNode node56 = new MyNode(56);
        MyNode node70 = new MyNode(70);
        MyNode node30 = new MyNode(30);

        list.append(node56);
        list.append(node70);

        list.insertAfter(node56, node30);
        list.printList();
    }
}