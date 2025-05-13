import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data  = data;
        this.next = null;

    }
}
 class LinkedList {
    private Node head;
    LinkedList(){
        head = null;
    }
    void insert(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    void print(){
        Node temp = head;
        System.out.print("head -> ");
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.print(" tail");
        System.out.println();
    }
    
    void insertAtFirst(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }else{
            n.next = head;
            head = n;
        }
    }


    void insertAtIndex(int val, int index){
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
    }


    //Sir ka method
    void instertAtIn(int data , int index){
        Node n = new Node(data);
        Node temp = head;
        int  i = 1;
        while (i <= index -2) {
            temp = temp.next;

            
        }
         n.next = temp.next;
         temp.next = n;
    }

    void insertAfter(int val, int data){
        Node p = find(val);
        if(p == null){
            System.out.println("Cannot find");
            return;
        }

        Node node = new Node(data);
        node.next = p.next;
        p.next = node;
        
    }


    Node find(int val){
        Node temp = head;
        while (temp != null) {
            if(temp.data == val ){
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }


    void deleteFirst(){
        if(head != null){
            Node temp = head;
            head = head.next;
            temp = null;
        }
        
    }
    void deleteLast(){
       Node temp = head;
        while (temp.next.next != null) {
           temp =  temp.next;
        }
        temp.next = null;
        
    }


    void reverseLL(){
        Node curr = head;
        Node prev = null;
        Node next ;


        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }

        head = prev;

    }


}

public class Single {

    public static void main(String[] args) {
        LinkedList li = new LinkedList();

        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 5; i++) {
        //     li.insert(sc.nextInt());   
        // }
        // li.print();
        li.insertAtFirst(80);
        li.insertAtFirst(1000);
        li.insert(6);
        // li.print();
        li.insert(8);
        // li.print();
        li.insert(10);

        li.insertAtIndex(66, 3);
        li.insertAfter(8, 77);
        li.print();
        li.reverseLL();
        li.insertAtIndex(88, 3);
        li.print();
       
       
    }
    
}