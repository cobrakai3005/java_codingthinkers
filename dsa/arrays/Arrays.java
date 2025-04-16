import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        sumOfArray();
        
    }

    static void sumOfArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("Sum the array "+ sum);
    }
}