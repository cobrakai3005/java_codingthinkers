public class Factors {
    public static void main(String[] args) {
        int n = 1232;

        System.out.println("Factors are");
        for (int i = 1; i <= n; i++) {
            if(n % i == 2){
                System.out.print( i + " ");
            }
            
        }
    }
}
