import java.util.ArrayList;
import java.util.List;

public class ProjectEuler007 {
    public String run() {
        List<Long> bigList = new ArrayList<>();
        List<Long> primeList = new ArrayList<>();
        bigList.add(2L);

        for (long i = 3L;  i <= 2000000L; i+=2) {
            bigList.add(i);
        }

        for (Long i : bigList) {
            if (primeList.size() == 10001) {
                System.out.println("Answer: " +primeList.get(10000));
                System.out.println(primeList);
                break;
            }
            if (Library.isPrime(i)) {
                primeList.add(i);
            }
        }
        return String.valueOf(primeList.get(10000));
    }
    public static void main(String[] args) {
        new ProjectEuler007().run();
    }
}
