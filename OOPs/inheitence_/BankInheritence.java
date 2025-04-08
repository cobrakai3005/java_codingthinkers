package inheitence_;
class Account{
    String name;
    int account_number;
    int balance;
    int initialBal;

    Account(String name, int firstDiposite ){
        initialBal = firstDiposite;
        System.out.println("Account Parent Class");
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

class MinMaxAccount extends Account{
    MinMaxAccount(String name, int firstDiposite){
        super(name, firstDiposite);
        System.out.println("MinMaxAccount Child Constructor");
    }
    int min  = initialBal;
    int max = balance;   
}

public class BankInheritence {
    public static void main(String[] args) {
        MinMaxAccount acc = new MinMaxAccount("Himanshu", 120);

        System.out.println(acc.min);


    }
}
