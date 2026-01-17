

class LinkedList {
    
    Node head;
    private int size;

    LinkedList(){
        this.size = 0;
    }

    class Node{
        int data;
        Node next;
    
        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        // System.out.println("Deleted " + head.data);
        head = head.next;
    }
    
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            size--;
            return;
        }

        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;
    }

    public void showList(){
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("NULL");
    }

    public int getSize(){
        return size;
    }

    public int searchElement(int value) {
        Node curr = head;
        int index = 0;
        while (curr != null) {
            if (curr.data == value)
                return index;
            curr = curr.next;
            index++;
        }
        return -1; // not found
    }

    public void deleteGreaterThan(int limit) {
        while (head != null && head.data > limit) {
            head = head.next;
            size--;
        }

        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.data > limit) {
                curr.next = curr.next.next;
                size--;
            } else {
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int[] arr = {32, 75, 23, 54, 23, 90, 11};

        for (int n : arr)
            list.addLast(n);

        // System.out.print("Linked List: ");
        // list.showList();

        // int value = 7;
        // int index = list.searchElement(value);

        // if (index != -1)
        //     System.out.println("Element " + value + " found at index: " + index);
        // else
        //     System.out.println("Element not found in list.");
        
    
        System.out.print("\nOriginal List: ");
        list.showList();

        list.deleteGreaterThan(25);

        System.out.print("Updated List (after deleting >25): ");
        list.showList();
        
    }
}
