class Node {
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class CDL {
    Node tail;
    CDL(){
       this.tail = null;  
    }


    // public void insertAtHead(int val){
    //     Node n = new Node(val);
    //     if(tail == null){
    //         tail.next = n;
    //         tail = n;
    //         return;
    //     }
    //     n.next = tail.next;
    //     tail.next = n;
          

    // }
   
    public void insertAtTail(int val){
        Node n = new Node(val);
        if(tail == null){
            tail = n;
            tail.next = n;
            tail.prev = n;
            
        }else{
            n.prev = tail;
            n.next = tail.next;
            tail.next = n;
            tail  = n;
            tail = tail.next;
            tail.next.prev = n;
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


 

}

public class CircularDoubly {


    public static void main(String[] args) {
        CDL circuar = new CDL();
        circuar.insertAtTail(10);
        circuar.insertAtTail(20);
        circuar.insertAtTail(30);
       
       

       
       
       
        circuar.printAll();
       
    }
}





