public class MyLinkedList {
    MyNode head;
    MyNode tail;
    public void add(MyNode newNode) {
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void append(MyNode newNode) {
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    // UC4
    public void insertAfter(MyNode prevNode, MyNode newNode) {
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
    // UC5
    public MyNode pop() {
        if (head == null)
            return null;
        MyNode temp = head;
        head = head.next;
        if (head == null)
            tail = null;
        return temp;
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