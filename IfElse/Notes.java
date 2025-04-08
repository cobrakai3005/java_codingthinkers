package IfElse;
import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
    Scanner  sc  = new Scanner(System.in);
    int amount = sc.nextInt();  

    if(amount >=  2000){
        System.out.println("Note of 2000  " +  amount/2000);
        amount = amount % 2000;
    }

    if(amount >=500){
        System.out.println("Note of 500  " +  amount/500);
        amount = amount % 500;
    }
    if(amount >=200){
        System.out.println("Note of 200  " +  amount/200);
        amount = amount % 200;
    }
    if(amount >=100){
        System.out.println("Note of 100  " +  amount/100);
        amount = amount % 100;
    }
    if(amount >=50){
        System.out.println("Note of 50  " +  amount/50);
        amount = amount % 50;
    }
    if(amount >=20){
        System.out.println("Note of 20  " +  amount/20);
        amount = amount % 20;
    }
    if(amount >=10){
        System.out.println("Note of 10  " +  amount/10);
        amount = amount % 10;
    }
    if(amount >=5){
        System.out.println("Note of 5  " +  amount/5);
        amount = amount % 5;
    }
    if(amount >=2){
        System.out.println("Note of 2  " +  amount/2);
        amount = amount % 2;
    }
    if(amount >=1){
        System.out.println("Note of 1  " +  amount/1);
        amount = amount % 1;
    }
    }
}
