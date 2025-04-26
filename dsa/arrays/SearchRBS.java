public class SearchRBS {

    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0));
    }

    static int search(int arr[], int tar){
        int st = 0;
        int en = arr.length-1;

        while (st <= en) {
            int mid = (st +en)/2;

            if(arr[mid] == tar) return mid;

            if(arr[st] <= arr[mid]){
                if(tar >= arr[st] && tar <= arr[mid]){
                    en = mid -1;
                }else{
                    st = mid + 1;
                }
            }else{
                if(tar >= arr[mid] && tar <= arr[en]){
                    st = mid +1;
                }else{
                    en = mid -1;
                }
            }
            
        }

        return -1;
    }
}