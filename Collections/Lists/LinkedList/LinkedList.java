package Collections.Lists.LinkedList;

class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to reverse the linked list
    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next; // Store next
            current.next = prev; // Reverse current node's pointer
            prev = current; // Move prev to current node
            current = next; // Move to next node
        }
        return prev; // New head of the reversed list
    }

    // Function to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        head = reverse(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}
    
    // Output
    // Original List:
    // 1 2 3 4 5
    // Reversed List:
    // 5 4 3 2 1
// Time Complexity: O(n)
// Space Complexity: O(1)
