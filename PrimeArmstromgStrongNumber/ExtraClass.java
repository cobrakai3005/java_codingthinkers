package PrimeArmstromgStrongNumber;

import java.util.Arrays;

public class ExtraClass {
    public static void main(String[] args) {
        singleNumber();
    }

    static void factors(){
        int num = 14;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
            System.out.println(i);
            }    
        }
    }

    static void factorial(){
    int num = 7;
    int factorial = 1;
    for (int i = 1; i <= num; i++) {
        factorial *= i;   
    }
    System.out.println(factorial);
}

    static void  fiveTable(){
        int num = 5;
        for (int i = 1; i <= 5; i++) {
            System.out.println("5 x  "+ i + " = "+  i*num);
            
        }
    }

    static void countDigit(){
        int num = 465678;
        int digit = 0;
        while (num > 0) {
            int rem = num %10;
            num = num/10;
            digit ++;
        }
        System.out.println(digit);
    }

     
     
}
