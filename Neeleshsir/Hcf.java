public class Hcf{
    public static void main(String[] args){
       int num1 = 100;
       int num2 = 150;
       int greaterNum = num1> num2 ? num1: num2;
       int lcm = 1;
       for (int i = 2; i <=greaterNum; i++) {
            if(num1 % i == 0 && num2 % i == 0){
                lcm *= i;
            }

       }
       System.out.println(lcm);
    }
}