public class MyLinkedList{
    MyNode head;
    public void add(MyNode newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        MyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}