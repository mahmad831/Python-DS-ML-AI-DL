public class DoublyLinkedList {

    private class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    // Adds a new node to the beginning of the list.
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Adds a new node to the end of the list.
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Removes the first node from the list.
    public void removeFirst() {
        if (head == null) {
            return;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp = null;
    }

    // Removes the last node from the list.
    public void removeLast() {
        if (tail == null) {
            return;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp = null;
    }

    // Prints the contents of the list.
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Returns the number of nodes in the list.
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // The main method is the entry point for all Java programs.
    public static void main(String[] args) {
        // Create a new linked list.
        DoublyLinkedList list = new DoublyLinkedList();

        // Add some nodes to the list.
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);

        // Print the contents of the list.
        list.print();

        // Remove the first node from the list.
        list.removeFirst();

        // Print the contents of the list again.
        list.print();

        // Get the size of the list.
        int size = list.size();
        System.out.println("The size of the list is " + size);
    }

}
