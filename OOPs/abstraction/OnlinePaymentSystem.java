package abstraction;
abstract class Payment{
    double amount;
    Payment(double amount){
        this.amount =  amount;
        
    }
    abstract void processPayment();

    void showAmount(){
        System.out.println("Payment amount: " + amount);
    }
}

class CreitCardPayment extends Payment{
    CreitCardPayment(double amount){
        super(amount);
    }
    void processPayment(){
        System.out.println("Processing Credit Card Payment of "+ amount);
    }
}
class PayPalPayment extends Payment{
     PayPalPayment(double amount){
        super(amount);
    }
    void processPayment(){
        System.out.println("Processing PayPal Payment of "+ amount);
     
    }
        
    
}

public class OnlinePaymentSystem {
    public static void main(String[] args) {
        PayPalPayment pay =new PayPalPayment(150.75);
        pay.processPayment();
        pay.showAmount();
    }
}
