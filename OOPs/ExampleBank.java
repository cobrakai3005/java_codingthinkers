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
    boolean withdrawal(int am){
        if(balance < am){
            return false;
        }
        balance -= am;
        check_balance();
        return true;
    }

    int check_balance(){
        System.out.println("Mr. / Mrs. "+ name +" your account has "+ balance);
        return balance;
    }
}
 
public class ExampleBank {
    

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
       

       while (true) {
        System.out.println(

        "Enter 1 for deposite : \n Enter 2 for Widthraw : \\n" + " Enter 3 for Check Balance : \\n" + //
 " Enter 4 for Exit "
        );
        int options  = sc.nextInt();
        

        switch (options) {
            case 1:
                System.out.println("Enter Amount for Deposite");

               acc.deposite(sc.nextInt()); 
               System.out.println();
                break;
            case 2:
            System.out.println("Enter Amount for Withdraw");
            boolean widthraw = acc.withdrawal(sc.nextInt());
            if (!widthraw) {
                System.out.println("Not enough money in your account ");
                continue;
            }
            System.out.println();
                break;
            case 3:
            System.out.println(" Checkbalance");
            acc.check_balance();
                break;
            case 4:
            System.out.println("Exit...");
                break;
           
            default:
                break;
        }
        
       }


        

    }


}

