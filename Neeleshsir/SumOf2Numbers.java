public class SumOf2Numbers {
    public static void main(String[] args) {
        int num1 = 129;//Input
        int num2 = 111  ;//Inputs
        int carry = 0;
        int sum = 0;
        int inc = 1;
        while (num1 > 0 ) {
            int rem1 = num1 % 10;
            int rem2 = num2 % 10;
            sum =((rem1 + rem2 + carry)%10)*inc + sum;
            carry = (rem1 + rem2 + carry) /10;
            
            inc *=10;
            num1/=10;
            num2/=10;
            
        }
        sum = (num2+carry) * inc + sum;

        System.out.println(sum);//300 output
    }
    
}