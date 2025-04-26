public class Sqrtx {

    public static void main(String[] args) {
        System.out.println(sqrt(16));
    }

    static int sqrt(int x){
        int st = 0;
        int en = x / 2;

        while (st <= en) {
            int mid  = (st + en)/2;

            if(mid * mid == x) return mid;

            if(mid * mid <= x) {
                st = mid +1;
            }
            if(mid * mid >= x) {
                en = mid -1;
            }
            
        }
        return -1;
    }
    //next question 1482
}
