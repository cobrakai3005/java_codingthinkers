class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        next = null;
    }
}

class LL {
    Node head;
    LL(){
        this.head = null;
    }

    void push(int val){
        Node n = new Node(val);
        if(head == null){
            head = n;
            return;
        }

        Node tem = head;
        tem.next = head;
        head = tem;

    }
    int pop(){
       
        if(head == null){
            System.out.println("Stack is empty");
            return -1;
        }

        Node tem = head;
       tem.next = tem.next.next;
       int d=tem.val;
       tem=null;
       return d;

    }
    int peek(){
       
        if(head == null){
            System.out.println("Stack is empty");
            return -1;
        }

      return head.val;

    }
    boolean isEmpty(){
       
        if(head == null){
            return true;
        }

        return false;
    }
    boolean isFull(){
       return false;
    }
}


class LLStack{
    LL list;

    LLStack(){
        list =  new LL();
    }

    void push(int val){
        list.push(val);
    }
    int peek(){
     return   list.peek();
    }
    void pop(int val){
        list.push(val);
    }
    boolean isEmpty(){
      return list.isEmpty();
    }
    boolean isFull(){
      return  list.isFull();
    }

}
public class StackLL {
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(23);
        st.push(3);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
       
    }
}
