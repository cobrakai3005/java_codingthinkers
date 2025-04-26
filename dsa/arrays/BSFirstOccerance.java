public class BSFirstOccerance {
    public static void main(String[] args) {
        int [] arr ={1, 2, 2, 2, 2, 3, 4, 5};
        int firstOccerence = (bsFirstOcc(arr, 2, true));
        int last = (bsFirstOcc(arr, 2, false));
    }

    static int bsFirstOcc(int[] arr, int target, boolean firstOcc){
        int st = 0;
        int en = arr.length -1;
        int ans = -1;
        

        while (st <= en) {
            int mid = (st + en) /2;
            if(target < arr[mid]){
                en = mid -1;
            }
            else if(target > arr[mid]){
                st = mid+ 1;
            }
            else{
                if(firstOcc){
                    ans = mid;
                    en = mid - 1;
                }else{
                    ans = mid;
                    st = mid + 1;
                }
            }
        }

        return ans;
    }
}
