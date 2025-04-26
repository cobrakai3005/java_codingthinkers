public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 6, 7, 99};
        int target = 99;
        System.out.println(binarySearch(arr, target));
    }

    static boolean binarySearch(int[] arr, int target){
        int lo = 0;
        int hi = arr.length-1;
        

        while (lo <=hi) {    
            int mid = (lo + hi)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(target < arr[mid]){
                hi = mid -1;
            }else{
                lo = mid +1;
            }
        }


        return false;


    }
    
}
