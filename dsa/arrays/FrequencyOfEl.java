import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfEl {
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int arr2[] = new int[30];
    //     for (int i = 0; i < arr.length; i++) {
    //         arr2[arr[i]] ++;
    //     }
    //     System.out.println("No of trys ");
    //    int n = sc.nextInt();

    //    while (n-- > 0) {
    //     System.out.println();
    //     System.out.println("number you want to search");
    //     int x = sc.nextInt();
    //     if(x > 29){
    //         System.out.println("No is too large");
    //         break;
    //     }
    //        System.out.print(arr2[x]);
    //    }
    int arr[] = {2,14,18,22,22};
    System.out.println(freq(arr));

    }

    static boolean freq(int[] arr){
        for (int i = 0; i < arr.length; i++) {
          int present = presentB(arr[i], arr);
          System.out.println(present);
          if(present >= 2){
           return true;
          }
          
        }
        return false;
    }
    static int presentB(int num, int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " " + num );
            if(num == nums[i]){
                count ++;
            }
        }

        return count > 0 ? count : -1;
    }
}
