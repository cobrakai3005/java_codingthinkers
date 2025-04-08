public class PerfectSquare {
    public static void main(String[] args) {
       if(isPerfectSquare(16)){
        System.out.println("PerfectSquare");
       } else{
        System.out.println("Not Perfect");
       }
    }
    static boolean isPerfectSquare(int num){

        int i = 2;
        while (i < num/2) {
            if(i*i == num){
                return true;
            }
            i++;
        }

        return false;
    }
}
