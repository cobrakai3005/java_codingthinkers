public class AutomorphicNumber {
   public static void main(String[] args) {
    int num = 22;
    // if(isAtmorphicNumber(num)){
    //     System.out.println("This is an Atmorphic Number");
    // }else{
    //     System.out.println("Not a Atmorphic Number");
    // }
    isAtmorphicNumber(76);

//     for (int i = 0; i <= 200; i++) {
//       if(isAtmorphicNumber(i)){
//           System.out.print(i+ " ");
//       }
//   }
   } 

   static void isAtmorphicNumber(int num){
    int n = num;
    int sq = n * n;
    System.out.println(sq);
    int check= 0;
    int digits = count(num);
    int last = sq % (int) Math.pow(10, digits);
    System.out.println(last == num);


   }

   static int count(int num){
    int count= 0;
    while (num > 0) {
        count++;
        num /=10;
    }
    return count;
   }
}
