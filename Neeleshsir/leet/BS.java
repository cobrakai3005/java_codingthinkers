public class BS{
    public static void main(String[] args) {
        int[] arr= {2, 3,4 ,5 ,6, 8, 9};
        System.out.println(bs(arr, 7));
    }

    static int  bs(int [] arr, int tar){
        int st = 0;
        int en = arr.length -1;

        while ( st <= en ) {
            int mid =  (st + en )/2;

            if(arr[mid] == tar ){
                return mid;
            }else if(tar < arr[mid]){
                en = mid -1;
            }else{
                st = mid +1; 
            }
            
        }

        return -1;
    }

}