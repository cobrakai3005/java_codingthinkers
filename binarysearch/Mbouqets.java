public class Mbouqets {
    

    public static boolean isPossible(int mid, int[] bloomDay, int m, int k){
        int count = 0, adj = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if(bloomDay[i] <= mid){
                adj++;
                if(adj == k){
                    count++;
                    adj = 0;
                }
            }else{
                adj = 0;
            }
        }

        return count >= m;
    }


    public static void main(String[] args) {
        
        int[] bloomDay = {1,10,3,10,2};
       int m = 3,  k = 1;
        int st = 0 , en = (int) 1e9, ans = -1;
        while ( st <= en) {
            int mid = (st +en)/2;
            if(isPossible(mid , bloomDay, m, k) == true){
                ans = mid;
                en = mid -1;
            }else{
                st = mid +1;

            }
        }
        System.out.println(ans);
    }
}
