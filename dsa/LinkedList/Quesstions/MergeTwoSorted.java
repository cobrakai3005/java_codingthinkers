class Node {
    int val ;
    Node next;
    Node(int val){
        this.val = val;
        this.next =null;
    }
}

public class MergeTwoSorted{
    public static void main(String[] args) {
        

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next =b;
        b.next = c;
        c.next = d;
        d.next =e;
        e.next =f;
        // Node p = new Node(1);
        // Node  q= new Node(3);
        // Node r = new Node(4);
        // p.next = q;
        // q.next = r;


        display(a);
        // display(p);

        // mergeTwoSorted(a, p);

       Node hNode =  rotate(a, 2);
       display(hNode);
    }

    static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void mergeTwoSorted(Node head1, Node head2){
        Node t1 = head1;
        Node t2 = head2;
         Node h = new Node(100);
         Node t =h;

         while (t1 != null && t2 != null) {
            if(t1.val < t2.val){
                t.next =t1 ;
                t= t.next;
                t1 =t1.next;
            }else{
                t.next = t2;
                t = t.next;
                t2 = t2.next;
            }
         }

         if(t1 == null){
          t.next = t2;
         }else if(t2 == null){
          t.next = t1;
         }

         t = h;
         display(t.next);
    }

  static Node rotate(Node head, int k){
    Node slo = head;
    Node fast = head;
    int size = 0;
   for (int i = 0; i < k; i++) {
    size++;
    fast = fast.next;
   }

   while (fast.next != null) {
    size++;
    slo = slo.next;
    fast = fast.next;
   }
   size++;
   Node temp = slo.next;
   Node t = temp;
   slo.next  = null;
   while (t.next != null) {
    t = t.next;
   }
   t.next = head;

   System.out.println(size);
   return temp;


  }

}