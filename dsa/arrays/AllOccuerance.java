public class AllOccuerance {
    public static void main(String[] args) {
        

        int ar [] = {1, 2, 2, 2, 3, 4, 5, 6, };

      int firstOcc =  bs(ar, 2, true);
      int lastOcc = bs(ar, 2, false);

      int tot = lastOcc - firstOcc + 1;
       System.out.print("Total Occuerance: "+ tot);
    }

   public  static int  bs(int[] ar, int tar, boolean first){
    int st = 0, en = ar.length -1;
    int ans = -1;
    while (st <= en) {
        int mid = (st + en)/2;
        if(tar < ar[mid]){
            en = mid -1;
        }
        else if(tar > ar[mid]){
            st = mid + 1;
        }else{
            ans = mid;
            if(first == true){
                en = mid -1;
            }else{
                st = mid + 1;
            }
        }
    }

    return (ans);

   }
}
