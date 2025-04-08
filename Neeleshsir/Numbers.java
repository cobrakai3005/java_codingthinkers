public class Numbers{
    public static void main(String[] args) {
        addOne();
    }


   static int digits(int n){
   
    int count = 0;
    int sum = 0;
    while (n> 0) {
        count++;
        int rem = n %10;
        sum += rem;
        n /= 10;
    }
    System.out.println(sum);
    return count;
   }

  


   


 

 



   static void addOne(){
    int n = 122;
    int ans  = 0;

    while (n > 0) {
        int rem = n % 10;
        System.out.println(rem);
        rem += 1;
        ans = ans*10 + rem;
        n /= 10; 
    }
    
    System.out.println(ans);
    int ans2 = 0;
    while (ans > 0) {
        int rem = ans%10;
        ans2 = ans2*10 + rem;
        ans /= 10;
    }


    System.out.println(ans2);
   }

}