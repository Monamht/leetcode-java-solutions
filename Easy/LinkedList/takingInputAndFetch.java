import java.util.Scanner;

class node{
    int data;
    node next ;
    
    node(int data , node next){
        this.data=data;
        this.next=next;
    }
    node(int data){
        this.data=data;
        this.next=null;
    }
}


public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter the length of the array :");
        int n = sc.nextInt();
        int [] arr=new int[n];
      
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
      
        System.out.println("Fetching all the elements of the array");
        for(int i=0; i<n;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
        
         if (n == 0) {
            System.out.println("Empty array, cannot create a Linked List.");
        }

        node head=new node(arr[0]);
        node temp=head;
        for(int i=1;i<n;i++){
            temp.next = new node(arr[i]);
            temp=temp.next;
        }
        
        System.out.println("Linked List elements are:");
        node print=head;
        while(print!=null){
            System.out.print(print.data + " -> ");
            print=print.next;
        }
        System.out.println("null");
    }
}
