public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.append(new MyNode(56));
        list.append(new MyNode(30));
        list.append(new MyNode(70));
        list.printList();

        MyNode node30 = list.search(30);
        if (node30 != null) {
            list.insertAfter(node30, new MyNode(40));
        }
        list.printList();
    }
}