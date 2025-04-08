public class Lcm {

    public static void main(String[] args) {
        int num1 = 92;
        int num2 = 510;
        int lcm = Integer.MAX_VALUE;
        int count= 0;
        for (int i = 1; i <= num2*num1; i++) {
            count++;
            if(i%num1 == 0 && i%num2 == 0){
                if(i < lcm){
                    lcm  = i;
                }
            }
            
        }
        System.out.println(count);
        System.out.println(lcm);
    }
}