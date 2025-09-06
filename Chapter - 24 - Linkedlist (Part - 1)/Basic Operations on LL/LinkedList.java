public class LinkedList {
    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    public int length = 0;

    // Add node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        length++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        length++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Add node at a specific index
    public void addAtIndex(int index, int data) {
        if (index < 0 || index > length) {
            System.out.println("Index out of bounds");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == length) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        length++;

        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print the linked list
    public void printLL() {
        if (head == null) {
            System.out.println("LL is empty!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the linked list
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(3);       // List: 3 -> 1 -> 2
        ll.addLast(4);        // List: 3 -> 1 -> 2 -> 4
        ll.addAtIndex(2, 0);  // List: 3 -> 1 -> 0 -> 2 -> 4

        ll.printLL();         // Output: 3 -> 1 -> 0 -> 2 -> 4 -> null
        System.out.println("Length: " + ll.length); // Output: Length: 5
    }
}