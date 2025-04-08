package constructors;
import java.util.Scanner;

class Account{
    String name;
    int account_number;
    int balance;



    Account(String naam, int am , int accNum){
        name = naam;
        balance = am;
        account_number = accNum;

    }
    void deposite(int am){
        balance += am;
        check_balance();
    }
    void withdrawal(int am){
        balance -= am;
        check_balance();
    }

    int check_balance(){
        System.out.println("Mr. / Mrs. "+ name +" your account has "+ balance);
        return balance;
    }
}
 
public class Bank {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name of your backaccount");
        String name  = sc.nextLine();


        System.out.println("Enter initial amount");
        int balance = sc.nextInt();
        System.out.println();

        System.out.println("Enter account number");
        int accNo = sc.nextInt();
        System.out.println();


        Account  acc = new Account(name, balance, accNo );
       

        acc.deposite(123);


        

    }


}
