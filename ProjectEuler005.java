import java.util.ArrayList;
import java.util.List;

public class ProjectEuler005 {
    private static final int dividerLimit = 20;
    public int run () {
        long x = 1;
        long ans;
        List<Integer> tallyCounter = new ArrayList<>();

        while(true) {
            for (int i = 1; i <= dividerLimit; i++) {
                if (x % i == 0) {
                    tallyCounter.add(i);
                } else {
                    tallyCounter.clear();
                    break;
                }
            }

            if (tallyCounter.size() == dividerLimit) {
                System.out.println("Answer: " + x);
                ans = x;
                break;
            }
            x++;
        }

        for (int i = 1; i <= dividerLimit; i++) {
            System.out.println(ans + "/" + i + "=" + ans / i);
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        System.out.println(new ProjectEuler005().run());
    }
}
