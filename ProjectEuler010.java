import java.util.ArrayList;
import java.util.List;

public class ProjectEuler010 {
    public String run() {
        long answer;
        List<Long> bigList = new ArrayList<>();
        List<Long> primeList = new ArrayList<>();
        bigList.add(2L);

        for (long i = 3L;  i <= 2000000L; i+=2) {
            bigList.add(i);
        }
        for (long i : bigList) {
            if (Library.isPrime(i)) {
                primeList.add(i);
            }
        }
        answer = primeList.stream().mapToLong(Long::longValue).sum();
        System.out.println("Answer: " + answer);
        return Long.toString(answer);
    }
    public static void main(String[] args) {
        new ProjectEuler010().run();
    }
}
