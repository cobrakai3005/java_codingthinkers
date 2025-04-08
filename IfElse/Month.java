package IfElse;
import java.util.Scanner;

public class Month{
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int mon = sc.nextInt();
        if(mon == 1 || mon== 3 || mon == 5 || mon ==7 || mon == 8|| mon ==10 || mon ==12){
            System.out.println("31");
        }
        if(mon == 6|| mon==  9|| mon == 11 ){
            System.out.println("30");
        }
        if(mon == 2){
            System.out.println("28");
        }
        
;    }
}