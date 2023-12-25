public class CircularLinkedList {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    // Adds a new node to the end of the list.
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    // Removes the first node from the list.
    public void remove() {
        if (head == null) {
            return;
        }
        Node temp = head;
        head = head.next;
        tail.next = head;
        temp = null;
    }

    // Prints the contents of the list.
    public void print() {
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Returns the number of nodes in the list.
    public int size() {
        int count = 0;
        Node current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }

    // The main method is the entry point for all Java programs.
    public static void main(String[] args) {
        // Create a new linked list.
        CircularLinkedList list = new CircularLinkedList();

        // Add some nodes to the list.
        list.add(1);
        list.add(2);
        list.add(3);

        // Print the contents of the list.
        list.print();

        // Remove the first node from the list.
        list.remove();

        // Print the contents of the list again.
        list.print();

        // Get the size of the list.
        int size = list.size();
        System.out.println("The size of the list is " + size);
    }

}
