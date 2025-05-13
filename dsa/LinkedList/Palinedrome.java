 class Node  {
    int val;
    Node next;
    public Node(int val){
        this.val = val;
        this.next = null;
    }
}


public class Palinedrome {
    
    public static Node reverseIterative(Node head){
        Node next = null;
        Node prev = null;
        Node cur = head;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            
        }

        return prev;
    }
    
    public static void printList(Node head){
        if(head.next == null) {
            System.out.println();
            return;
        }
        System.out.print(head.val + " -> ");
        printList(head.next);
    }
    
    public static void maxTwinSum(Node head){
        // 1 -> 3 -> 5 -> 8 -> 6 -> 5 ->null

        Node slow = head;
        Node fast = head;
        if(fast  == null) return ;
        if(fast.next == null) return;

        while (fast.next!=null && fast.next.next != null ) {
            slow= slow.next;
            fast = fast.next.next; 
        }
        slow.next = reverseIterative(slow.next);
        printList(head);
        Node p1 = head;
        Node p2 = slow.next;
        int maxS = Integer.MIN_VALUE;
        
        while (p2 != null) {
           int sum = p1.val + p2.val;
           maxS = Math.max(maxS, sum);
           p1 = p1.next;
           p2 = p2.next;
        }
        System.out.println(maxS);
    }
    public static void main(String[] args) {
        
    
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(1);
        // Node g = new Node(9);
        // Node h = new Node(2);
        a.next = b;
        b.next =  c;
        c.next = d;
        d.next = e;
        e.next =f;
        // f.next = g;
        // g.next = h;
       
        // printList(a);
        maxTwinSum(a);
        
   
        
        
    }
}
