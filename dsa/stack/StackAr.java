import java.util.Arrays;


public class StackAr{
    static class Stack{
        int top ;
        int ar[];
        int size;
        Stack(int size){
          this.size = size;
          ar = new int[size];
          top = -1;
        }

        void push(int val){
            if(top == (size -1)){
                System.out.println("Stack Overflow");
                return;
            }
            ar[++top] = val;
        }
        int pop(){
            if(top == -1){
                System.out.println("Stack Underflow");
                return -1;
            }
            int x = ar[top];
            top--;
            return x;
        }
        int peek(){
            if(top == -1){
                System.out.println("Stack isEmpty");
                return -1;
            }
           return ar[top];
        }

        void display(){
            System.out.println(Arrays.toString(ar));
        }

        boolean isEmpty(){
         return top == -1;
        }
        boolean isFull(){
         return top == size-1;
        }


        

    }


    class StackLLL{
        
    }

    public static void main(String[] args) {
        Stack st = new Stack(6);
        st.push(30);
        st.push(20);
        st.push(10);
        System.out.println(st.peek());
        st.display();
       
        
        
    }
}