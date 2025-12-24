public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.append(new MyNode(56));
        list.append(new MyNode(30));
        list.append(new MyNode(70));

        MyNode foundNode = list.search(40);

        if (foundNode != null) {
            System.out.println("Node found with value: " + foundNode.data);
        } else {
            System.out.println("Node not found");
        }
    }
}