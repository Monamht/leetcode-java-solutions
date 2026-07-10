/**Implement stack using linked list
Problem Statement: Implement a Last-In-First-Out (LIFO) stack using a singly linked list. 
The implemented stack should support the following operations: push, pop, top, and isEmpty.

Implement the LinkedListStack class:
void push(int x): Pushes element x onto the stack.
int pop(): Removes and returns the top element of the stack.
int top(): Returns the top element of the stack without removing it.
boolean isEmpty(): Returns true if the stack is empty, false otherwise. 

Complexity Analysis
Time Complexity: O(1) for push, pop, size, isEmpty, peek operations.
Space Complexity: O(N) because the stack requires space proportional to the number of elements it stores.
**/

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {

    Node top;

    // Push
    void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
    }

    // Pop
    int pop() {

        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int value = top.data;
        top = top.next;

        return value;
    }

    // Peek
    int peek() {

        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    // isEmpty
    boolean isEmpty() {
        return top == null;
    }

    // Display
    void display() {

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.print("Stack: ");
        st.display();

        System.out.println("Top: " + st.peek());

        System.out.println("Popped: " + st.pop());

        System.out.print("After Pop: ");
        st.display();

        System.out.println("Is Empty: " + st.isEmpty());
    }
}
