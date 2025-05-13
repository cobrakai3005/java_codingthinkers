class DL{
    Node head;
    DL(){
        head = null;
    }

    void insertLast(int val){
        Node n = new Node(val);

        if(head == null){
            head = n;
        }else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
            n.prev = temp;
        }
    }
    void insertFirst(int val){
        Node n = new Node(val);

        if(head == null){
            head = n;
        }else{
           n.next = head;
           head.prev = n;
           head = n;
        }
    }

    void print(){
        Node temp = head;
        if(temp == null) return;

        while(temp != null) {
            System.out.print(temp.data + " "  + temp.prev + " " + " -> " );
            temp = temp.next;
        }
System.out.println();


    }
    void deleteFirst(int val){
        if(head == null){
       return;
        }else{
          head.prev = null;
          head = head.next;

        }
    }
    void deleteLast(int val){
        if(head == null){
       return;
        }else{
         Node temp = head;
         while (temp.next.next != null) {
            temp = temp.next;
         }
         temp.next.prev = null;
         temp.next =  null;

        }
    }


    void insert(int val, int index){
        if(head == null) return;
        if(index == 1) insertFirst(val);

        Node temp = head;

        for (int i = 1; i <= index-2; i++) {
            temp = temp.next;

        }
        Node n = new Node(val);
        n.next =temp.next;
        n.prev = temp;
        temp.next = n;


    }

    void delete(int index){
        if(head == null) return;
    
        Node temp = head;

        for (int i = 1; i <= index-2; i++) {
            temp = temp.next;

        }
        
       temp.next = temp.next.next;
       temp.next.next.prev = temp;
    }


    class Node{
        int data;
        Node next;
        Node prev;
        Node(int val){
            this.data = val;
            next = null;
            prev = null;
        }

    }

}

public class Double {

    public static void main(String[] args) {
        DL dl = new DL();
        dl.insertLast(23);
        dl.insertLast(67);
        dl.insertLast(12);
        dl.insertLast(87);
        dl.insertLast(2);
        dl.insertLast(0);
        dl.insert(45, 3);
        dl.print();
        dl.delete(3);
        dl.print();
    }
}
