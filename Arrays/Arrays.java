package Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        System.out.println("hello");
        diffOfSumOfArrAndDigitsSumOfArray();
    }

    static void diffOfSumOfArrAndDigitsSumOfArray(){
 // sumOfAnArray(5);
    int [] arr = arrayInOut();

 // countEven(arr);
    int sum = sumOfAnArray(4);
    int sumD = 0;
    for (int i = 0; i < arr.length; i++) {
     int digits = digitsum(arr[i]);
     sumD =+ digits;
    }
    System.out.println(sum);
    System.out.println(sumD);
 
 //    Difference 
    System.out.println(sum - sumD);
}

    static int[] arrayInOut(){
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter size of the array");
            int size = sc.nextInt();
            int [] arr = new int[size];
            
        
            for (int i = 0; i < size; i++) {
                System.out.println("Enter index number " + i);
                arr[i] = sc.nextInt();
            }
        
        
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] +  ", ");
            }

            return arr;
    }

    static int sumOfAnArray(int n){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();   
        }

        for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
    System.out.println("Sum is "+ sum);


    //For Avarage
    avarageOf(sum, n);
return sum;

    }

    static void avarageOf(int sum , int n){
       System.out.println("Avareage is "+ sum / n);
    }

    static void countEven(int[] arr){
        
        int even = 0 ;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] % 2 == 0){
            even++;
           } else{
            odd++;
           }
            
        }

        System.out.println("Even No are " + even);
        System.out.println("Odd No are " + odd);
    }

    static int digitsum(int num){
        int digitsum = 0;
            while ( num > 0) {
                int rem = num%10;
                digitsum += rem;
                num = num /10;   
            }

    return digitsum;
  }

}

