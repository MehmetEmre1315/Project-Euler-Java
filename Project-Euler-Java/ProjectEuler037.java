public class ProjectEuler037 {
    public String run() {
        int answer = 0;
        for (int i = 0; i < 1000000; i++) {
            if (Library.isPrime(i)) {
                int[] array = Library.removeDigitRightAndLeft(i);
                int primeCount = 0;
                for (int prime : array) {
                    if (Library.isPrime(prime)) primeCount++;
                    if (primeCount == array.length) {
                        answer += i;
                        System.out.println(i);
                    }
                }
            }
        }

        System.out.println("The sum of primes that are both truncatable from left to right and right to left is: " +
                answer);

        return Integer.toString(answer);
    }

    public static void main(String[] args) {
        new ProjectEuler037().run();
    }
}