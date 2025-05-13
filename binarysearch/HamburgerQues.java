import java.util.Scanner;

public class HamburgerQues{
   // https://codeforces.com/problemset/problem/371/C

   /* Input

            BBBSSC
            6 4 1
            1 2 3
            4
    OUTPUT
    4

    */
    static long maxHam(){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int rb = 0, rs = 0, rc = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'B') rb++;
            else if(s.charAt(i) == 'S') rs++;
            else rc++;

        }
            int ab = sc.nextInt() , as = sc.nextInt(), ac = sc.nextInt();
            
            int pb = sc.nextInt();
            int ps = sc.nextInt();
            int pc = sc.nextInt();

            long  amount =  sc.nextLong();
            long st = 0;
            long en = (long) 1e13;
            long ans= -1;

            while (st <= en) {
                long mid = (st + en )/2;
                long rpb = Math.max(0, (rb * mid - ab)*pb);
                long rps = Math.max(0, (rs * mid - as)*ps);
                long rpc = Math.max(0, (rc * mid - ac)*pc);
                long total = rpb + rps+ rpc;
                if(total <= amount){
                    ans = mid;
                    st = mid +1;
                }else{
                    en = mid -1;
                }
            }

            return ans;
            
   
    }
    public static void main(String[] args) {
        System.out.println(maxHam());
    }
}