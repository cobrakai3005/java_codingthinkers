
public class FIbo {

    public static void main(String[] args) {
        fibo(6);
    }

    static void fibo(int n){
        int f = 0;
        int s = 1; 

        int c = 2;

        while ( c <= n) {  
            int temp = s; 
            s = f+ s;
            f = temp;
            c++;
        }

        System.out.println(s);
    }
}