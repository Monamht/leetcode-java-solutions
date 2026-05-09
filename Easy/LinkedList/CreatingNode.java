/**There are two information sets to store at every node, thus there is a need to create a self-defined data type to handle them. 
Therefore, we will use the help of structs and classes. To learn about structs and classes, you can refer to this article.**/

//CODE FOR CREATING NODE
// (Node class represents a node in the linked list)
class Node {
    int data;      // Data value
    Node next;     // Pointer to next node

    // Constructor with data and next
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data
    Node(int data1) {
        data = data1;
        next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array
        int[] arr = {2, 5, 8, 7};

        // Create first node
        Node y = new Node(arr[0]);

        // Print memory reference of node
        System.out.println(y);

        // Print data stored in node
        System.out.println(y.data);
    }
}

/**Let's break this example to understand how it works:
1)The class has two data types: data which contains the value of the node and a pointer next, which points to the next node in the list.
2)There is a constructor which assigns the values to a new node.
3)A new keyword is used to dynamically allocate memory to a node with data as arr[0].

Understanding Pointers
1)A pointer is a variable that stores the memory address of another variable. In simpler terms, it "points" to the location in memory where data is stored.
This allows you to indirectly access and manipulate data by referring to its memory address.

2)Java does not explicitly use pointers or take the address of variables as you do in C++. Instead, we have reference variables.
These reference variables do not directly contain memory addresses like pointers in languages such as C or C++. Instead, they hold references to objects in memory.

Understanding the difference between Node and Node*: A node refers to the structure that contains data and the pointer to the next node.
In contrast, Node* (Node pointer) specifically denotes a pointer variable that stores the address of the Node it is pointing to.**/
