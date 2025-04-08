package Methods;

import java.util.Scanner;

public class Method {
public static void main(String[] args) {
    // int sum = sum(5, 6);
    // System.out.println(sum);

    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    // int num2 = in.nextInt();
    // int num3 = in.nextInt();

    // System.out.println(min(num, num2, num3));
    // System.out.println(checkPalinedrome(num));
}

 static int sum(int a , int b){
    return a + b;
   }

 static int min(int a, int b , int c){
    int min  = a;
    if( b < min){
      min = b;
    }
      if(c< min){
      min = c;
    }
    return min;
   } 

static boolean checkPalinedrome(int num){
    int n  = num;
    int ans = 0;
    while (num > 0 ) {
        int rem = num%10;
        num = num/10;
        ans = 10*ans + rem;
    }

    return ans == n;}


}
