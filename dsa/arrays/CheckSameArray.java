public class CheckSameArray {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 1, 2};
    int[] arr2 = {1,2,3,4};

    int [] freq1= new int[20];

    for (int i = 0; i < freq1.length; i++) {
        freq1[arr1[i]]++;
    }
    int [] freq2= new int[20];

    for (int i = 0; i < freq2.length; i++) {
        freq2[arr2[i]]++;
    }

    
   }  



}
