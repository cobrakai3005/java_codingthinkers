package PrimeArmstromgStrongNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    }

    static void primeNumber(){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int c = 2;

      while (c < num) {  
        if(num % c == 0){     
          break; 
        }else{
          c++;    
        }    
      }
      if(c == num){
        System.out.println("Prime");
      }

    }

    ArrayList
    static void armstrongNumber(){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int n1 = num;

      int digitCount = countDigit(num);

      int sum = 0;
      while (num> 0) {
        int rem = num%10;
        sum += Math.pow(rem, digitCount);
        num = num/10;
      }
     if(sum == n1){
      System.out.println("ArmStrong Number ");
     }else{
      System.out.println("Not ArmStrong Number ");
     }
    }
  
    static void strongNumber(){
      Scanner sc = new Scanner(System.in);
      //Strong Number;
      // Count digits
      int num = sc.nextInt();

      int  h= num;
      int ans = 0;
      while (num > 0) {
        int fact = 1;
        int  rem = num % 10; 
          for (int i = 1; i <=rem; i++) {
            fact *= i;
          }
        num = num / 10;
        ans += fact;
      }  

      if(ans == h){
        System.out.println("Strong number");
      }else{
        System.out.println("Not STrong");
      }
    }

    static int countDigit(int num){
      int count = 0;
      while (num> 0) {
        int rem = num%10;
        num = num /10;
        count++;
        
      }

      return count;
    }


}
