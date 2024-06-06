import java.util.ArrayList;
import java.util.List;

public class ProjectEuler014 {
    static long evenNumberSequenceRule(long n) {
        return n/2;
    }
    static long oddNumberSequenceRule(long n) {
        return 3*n + 1;
    }

    public String run() {
        long n;
        int listSize = 0;
        long answer = 0;
        List<Long> list = new ArrayList<>();
        for (long i = 999999; i > 1; i--) {
            n = i;
            list.add(n);
            while (true) {
                if (n % 2 == 0) {
                    n = evenNumberSequenceRule(n);
                } else {
                    n = oddNumberSequenceRule(n);
                }

                list.add(n);
                if (n == 1) {
                    if (list.size() > listSize) {
                        listSize = list.size();
                        answer = list.get(0);
                    }

                    list.clear();
                    break;
                }
            }
        }
        System.out.printf("Answer: " + answer);
        return String.valueOf(answer);
    }
    public static void main(String[] args) {
        new ProjectEuler014().run();
    }
}