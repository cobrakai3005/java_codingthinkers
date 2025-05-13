class Node {
    int data;
    Node next;
    Node(int data){
        this.data  = data;
        this.next = null;

    }
}

class LL {
    private Node head;
    LL(){
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


    void print(Node head){
        Node temp = head;
        System.out.print("head -> ");
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.print(" tail");
        System.out.println();
    }

    public void evenOddList(Node head){
        print(head);
        Node temp = head;
        Node headO = new Node(-1);
        Node headE = new Node(0);
        Node tempO = headO;
        Node tempE = headE;
      
        while (temp != null) {
            if( temp.data%2  == 0){
              Node node = new Node(temp.data);
              tempE.next = node;
              tempE = tempE.next;
              temp = temp.next;
            }else{
              Node node = new Node(temp.data);
              tempO.next = node;
              tempO = tempO.next;
              temp = temp.next;
            }
            
        }
        tempE = headE.next;
        tempO = headO.next;
       
        print(tempO);
        print(tempE);
    
    }


   public void oddEvenIndex(Node head){
    print(head);
    Node temp = head;
    Node headO = new Node(-1);
    Node headE = new Node(0);
    Node tempO = headO;
    Node tempE = headE;
    int count=1;
    while (temp != null) {
        if(count %2  == 0){
          Node node = new Node(temp.data);
          tempE.next = node;
          tempE = tempE.next;
          temp = temp.next;
        }else{
          Node node = new Node(temp.data);
          tempO.next = node;
          tempO = tempO.next;
          temp = temp.next;
        }
        count++;
    }
    tempE = headE.next;
    

    tempO.next  =tempE;
    tempO = headO.next;
    print(tempO);
    // print(tempE);
    }


}





public class OddEven {
    public static void main(String[] args) {
        LL list  = new LL();
        Node node = new Node(2);
        node.next = new Node(7);
        node.next.next = new Node(6);
        node.next.next.next = new Node(8);
        node.next.next.next.next = new Node(7);
        node.next.next.next.next.next = new Node(3);
        node.next.next.next.next.next.next = new Node(66);
        node.next.next.next.next.next.next.next = new Node(77);
        node.next.next.next.next.next.next.next.next = new Node(79);
        node.next.next.next.next.next.next.next.next.next = new Node(17);

        list.evenOddList(node);
        // list.oddEvenIndex(node);
    }
}



