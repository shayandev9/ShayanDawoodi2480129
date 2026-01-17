

class DoublyLL {

    Node head, tail;

    class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data +  " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteLast() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        // Case 1: delete head
        if (temp.data == value) {
            head = head.next;
            if (head != null) head.prev = null;
            System.out.println(value + " deleted.");
            return;
        }

        // Traverse to find node
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found.");
            return;
        }

        
        // Update tail if last node is being deleted
        if (temp.next == null) {
            tail = temp.prev;
        }


        // Update links
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;

        System.out.println(value + " deleted.");
    }



    public static void main(String[] args) {
    
        DoublyLL dll = new DoublyLL();

        dll.addFirst(20);
        dll.addFirst(10);
        dll.addLast(30);
        dll.addLast(40);

        dll.printForward();
        dll.printBackward();

        dll.deleteFirst();
        dll.printForward();

        dll.deleteLast();
        dll.printForward();
        
        dll.deleteByValue(30);
        dll.printForward();
    }
}
