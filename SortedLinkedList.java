public class SortedLinkedList {
    MyNode head;
    public void add(MyNode newNode) {
        if (head == null || newNode.data < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        MyNode current = head;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
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