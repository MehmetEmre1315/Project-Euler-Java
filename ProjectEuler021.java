import java.util.ArrayList;
import java.util.List;

public class ProjectEuler021 {
    static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public String run() {
        List<Integer> amicableNumbers = new ArrayList<>();
        for (int i = 1; i < 10000; i++) {
            if (amicableNumbers.contains(i)) continue;
            int sum1 = sumOfDivisors(i);
            int sum2 = sumOfDivisors(sum1);
            if (i == sum2 && i != sum1) {
                amicableNumbers.add(i);
                amicableNumbers.add(sum1);
            }
        }

        System.out.print("Amicable numbers under 10000: ");
        System.out.println(amicableNumbers);
        System.out.println("Answer: " + amicableNumbers.stream().mapToInt(i -> i).sum());

        return String.valueOf(amicableNumbers.stream().mapToInt(i -> i).sum());
    }
    public static void main(String[] args) {
        new ProjectEuler021().run();
    }
}