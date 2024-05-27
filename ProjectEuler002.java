import java.util.ArrayList;
public class ProjectEuler002 {
    public long run() {
        long n0 = 1L;
        long n1 = 2L;
        long ans = 0L;
        ArrayList<Long> fibonacciList = new ArrayList<>();

        for (long i = 0; i < 100 ; i++) {
            fibonacciList.add(n0);
            long n2 = n0 + n1;
            n0 = n1;
            n1 = n2;

            if (n0 >= 4* Math.pow(10, 6)) {
                break;
            }
        }

        for (Long i : fibonacciList) {
            if (i % 2 == 0) {
                ans += i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new ProjectEuler002().run());
    }
}
