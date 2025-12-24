public class LinkedListMain{
    public static void main(String[] args) {
        MyNode node56 = new MyNode(56);
        MyNode node30 = new MyNode(30);
        MyNode node70 = new MyNode(70);

        MyLinkedList list = new MyLinkedList();
        list.add(node70);
        list.add(node30);
        list.add(node56);

        list.printList();
    }
}
