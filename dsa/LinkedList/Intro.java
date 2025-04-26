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
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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
}

public class Intro {

    public static void main(String[] args) {
        LinkedList li = new LinkedList();

        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 5; i++) {
        //     li.insert(sc.nextInt());   
        // }
        // li.print();
        li.insert(6);
        li.print();
        li.insert(8);
        li.print();
        li.insert(10);
        li.print();
        li.insertAtFirst(80);
        li.print();
        li.insertAtFirst(1000);
        li.print();

        li.deleteFirst();
        li.deleteLast();
        li.print();
    }
    
}