public class Number {
    public static void main(String[] args) {
        System.out.println("hello");
        // swapFirstAndLast(34546);
        addOnePerDigit(239);
    }

    static void swapFirstAndLast(int num){
        System.out.println(num);
        int a = num;
        int last = num %10;
        int first = 0;
        int digits = countDigit(num);// count digits
        while ( a> 0) {
            first = a %10;
            a /= 10;
        }
        //At the end of this loop you will get first digit
        //And they are below 
        System.out.println(first + " " + last + " " + digits);
        System.out.println("num"+ num);
        //to find middle part remove the last digit from the number
        int mid = num / 10; //This has first +  midddle
        System.out.println("mid" + mid); // the is  first + mid number  and you have to take out first number as well ? how by taking the remainder of mid % 100.. somthing removing first and last digist zeros
        int power = (int) Math.pow(10, digits -2);
        System.out.println(power);
        mid =mid % power;
        //Here you get the middle number
        System.out.println("mid" + mid);
        //Now you have to make the number

        //here is  Last   * 1000...  + mid
        num = last *  (int)Math.pow(10, countDigit(mid)) + mid;
        //And now add the first to last
        // num * 10   + first number
        num = num * 10 + first;
        System.out.println("ans" + num);

        

    }

    static int countDigit(int num){
        int count = 0;
        while (num > 0) {
            num = num/10;
            count++;
            
        }
        return count;
    }

    static int calculatePower(int num1, int num2){
        int power = 1;

        for (int i = 1; i <=num2; i++) {
           power = num1 * num2;
        }
        return power;
    }
    
    static int getFirstDigit(int num){
        int first = 0;
        while (num > 0) {
            first = num %10;
            num /= 10; 
        }
        return first;
    }

    static void addOnePerDigit(int num){
        System.out.println(num);
        int digits = countDigit(num);
   
        int revAns = 0;
        int carry = 0 ;
        int zeros = 0;
        for (int i = 0; i < digits; i++) {
            int rem = num %10;
           
            if(rem > 9){
                carry = 1;
                zeros += 1;
                rem = 0;
            }else{

                rem = rem + 1;
                revAns = revAns *10 + rem ; 
                System.out.println("rev" + revAns);
                num /= 10;
            }
        }

        System.out.println(revAns);
    }

    
}
