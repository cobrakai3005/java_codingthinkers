class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

 class CLL {
    Node tail;
   
    CLL(){
       this.tail = null;  
    }


    public void insertAtHead(int val){
        Node n = new Node(val);
        if(tail == null){
            tail.next = n;
            tail = n;
            return;
        }
        n.next = tail.next;
        tail.next = n;
          

    }
   
    public void insertAtTail(int val){
        Node n = new Node(val);
        if(tail == null){
            tail = n;
            tail.next = n;
            return;
        }else{
            n.next = tail.next;
            tail.next = n;
            tail  = n;
        }

    }

    public  void printAll(){
        if(tail == null) return;
        Node temp = tail.next;
        do{
            System.out.print(temp.val + " -> ");
            temp = temp.next;
            // System.out.println();
        }while(temp != tail.next);
        
        System.out.println();
    }

    public void deleteAtHead(){
        if(tail == null) return;
        if(tail.next ==  tail) return ;
        tail.next = tail.next.next;
    }
   
    public void deleteAtTail(){
        if(tail == null) return;
        if(tail.next == tail) {
            return ;
        }
        Node temp = tail.next;
        while (temp.next !=tail) {
            temp  = temp.next;
        }
        temp.next = temp.next.next;
        tail = temp;
    }


    public void findMid(){
        Node slow = tail.next;
        Node fast = tail.next;

        while (fast != tail && fast.next != tail) {
           slow = slow.next; 
           fast = fast.next.next;
        }

        System.out.println(slow.val);
    }  

}

public class CircularList {

    public static void main(String[] args) {
        CLL circuar = new CLL();
        circuar.insertAtTail(10);
        circuar.insertAtTail(87);
        // circuar.insertAtTail(20);
        circuar.insertAtTail(70);
        circuar.insertAtTail(80);
        circuar.insertAtTail(1000);
        circuar.insertAtTail(-220);
        circuar.insertAtTail(66);
        circuar.insertAtHead(33);

        // circuar.printAll();

        
        //circuar.insertAtTail(20);
        //.printAll();
        // circuar.deleteAtTail();
       
       
        circuar.printAll();
        circuar.findMid();
        // circuar.deleteAtTail();
        // circuar.printAll();
    }
}



