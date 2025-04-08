interface BankAccount{
    void deposit(int amount);
    void withdrawal(int amount);
    void check_balance();  
}


class SavingsAccount implements BankAccount{
    int balance;
    int limit = 500;
    SavingsAccount(){}

    public void deposit(int amount){
        this.balance += amount;
        check_balance();
    }
    public void withdrawal(int amount){
        if(balance < 500 ){
            System.out.println("You account balance is below our withdrawl limit. Please deposit to keep withdrawing.");
        }else{
            balance -= amount;
        }
    }
    public void check_balance(){
        System.out.println("You Account Balance is "+ "Rs. "+ balance);
    }
   
}
class CurrentAccount{
    int balance;
    int overdraftlimit = 1000;
    CurrentAccount(){}

    public void deposit(int amount){
        this.balance += amount;
        check_balance();
    }
    public void withdrawal(int amount){
        if(amount > overdraftlimit ){
            System.out.println("You account balance is below our withdral limit. Please deposit to keep withdrawing.");
        }else
        balance -= amount;
        check_balance();
    }
    public void check_balance(){
        System.out.println("You Account Balance is "+ "Rs. "+ balance);
    }
}

public class InterfaceBankAcc {
    public static void main(String[] args) {
        SavingsAccount savingAcc = new SavingsAccount();
        savingAcc.check_balance();
        savingAcc.withdrawal(345467);

        
        CurrentAccount currAcc = new CurrentAccount();
        currAcc.check_balance();
        currAcc.withdrawal(1001);
       
    }
}
