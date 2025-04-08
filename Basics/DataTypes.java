package Basics;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
   
     System.out.println("Enter number: ");
     int  n = sc.nextInt();
     System.out.println("Enter Float: ");
     float f= sc.nextFloat();
     System.out.println("Enter Double: ");
     double  doub = sc.nextDouble();
     System.out.println(doub);
     System.out.println("Enter long: ");
   
     long lo = sc.nextLong();
     System.out.println(lo); 
     short sh = sc.nextShort();  

     String string = sc.next();
     char c = string.charAt(0);


     System.out.println(n); 
     

    int a = 10;
    byte b = (byte)a;
    System.out.println(b);

    }
   
  
    }



//TypeCast
// 1. Implicit : byte-> short ->int -> ong-> float -> double

//2. Explicit ;
// (type)
// byte <- short <- int <- long <-float <double
