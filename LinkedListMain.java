public class LinkedListMain {
    public static void main(String[] args) {
        SortedLinkedList sortedList = new SortedLinkedList();
        sortedList.add(new MyNode(56));
        sortedList.add(new MyNode(30));
        sortedList.add(new MyNode(40));
        sortedList.add(new MyNode(70));

        sortedList.printList();
    }
}