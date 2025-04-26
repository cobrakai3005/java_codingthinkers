public class LinearSearch {
    public static void main(String[] args) {
        int[] arr  = {10, 15, 25, 25, 6, 18};
        int target = 6;
        boolean f= false;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == target){
                System.out.println("Element Found at "+ i);
                f = true;
                break;
            }
        }

        if(f == false) System.out.println("Not Found");
    }
    
}
