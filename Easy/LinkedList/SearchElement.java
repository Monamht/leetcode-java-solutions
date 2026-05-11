/**Problem Statement: Given the head of a linked list and an integer value, find out whether the integer is present in the linked list or not.
Return true if it is present, or else return false.

#APPROACH
1.Initialise a temporary pointer to traverse the entire list.
2.During the traversal, check if the data on the current node matches the specified value. If no match is found, move to the next node.
3.Continue this traversal until either fast (or next node of fast) reaches null or both the pointers, slow and fast, meet.
4.At any moment, if the data of the node matches with the val, stop and return true.
5.If the temporary pointer reaches null without finding the required value, return false.

Time Complexity: O(N), we traverse the entire linked list once in worst case to search for the required value.
Space Complexity: O(1) , we use a constant amount of additional space, regardless of the linked list's length to search for an element.**/

// Node class for Linked List
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

// Solution class containing search function
class Solution {
    // Function to search for a value in LL
    public boolean searchValue(Node head, int key) {
        // Pointer to traverse the list
        Node current = head;

        // Traverse until end
        while (current != null) {
            // Check if current node matches key
            if (current.data == key) {
                // Return true if found
                return true;
            }
            // Move to next node
            current = current.next;
        }

        // Return false if not found
        return false;
    }
}

// Driver class
public class SearchEleLL {
    public static void main(String[] args) {
        // Creating linked list: 10 -> 20 -> 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Solution obj = new Solution();

        // Search for value
        if (obj.searchValue(head, 20))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
