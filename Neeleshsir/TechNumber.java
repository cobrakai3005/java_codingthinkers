public class TechNumber {
    public static void main(String[] args) {
        int num = 2025;
        if(isTechNo(num)){
            System.out.println("This is Tech Number");
        }else{
            System.out.println("Not Tech Number");
        }


        TechNumberFrom(1000, 20000);
        
    }

    static void TechNumberFrom(int num1, int num2){
        for (int i = num1; i <= num2; i++) {
            if(isTechNo(i)){
                System.out.print(i+ " ");
            }
        }
    }

    static boolean isTechNo(int num){
        int digits = digits(num);
        if(digits % 2 != 0){
            return false;
        }
        int last = num % (int) Math.pow(10, (digits(num)/2));
        int first = num / (int) Math.pow(10, (digits(num)/2));
        int sum = first +last;
        if((int)Math.pow(sum, 2) == num){
            return true;
        }
        return false;
    }

    static int digits(int n){
        int count = 0;
        while (n > 0) {
            count ++;
            n /=10;
        }
        return count;
    }

}
