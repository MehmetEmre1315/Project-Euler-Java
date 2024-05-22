public class Main {
    static boolean isPrime (long number) {
        if (number < 2) return false;
        if (number == 2) return true;
        for (long i = 2L; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    static int[] removeDigitRightAndLeft (int number) {
        String str = String.valueOf(number);
        int [] array = new int[(str.length() * 2) -2];
        for (int i = 0; i < str.length() - 1; i++) {
            array[i] = Integer.parseInt(str.substring(0,i+1));
            array[i + str.length() - 1] = Integer.parseInt(str.substring(i+1));
        }
        return array;
    }
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 0; i < 1000000; i++) {
            if (isPrime(i)) {
                int[] array = removeDigitRightAndLeft(i);
                int primeCount = 0;
                for (int prime : array) {
                    if (isPrime(prime)) primeCount++;
                    if (primeCount == array.length) {
                        answer += i;
                        System.out.println(i);
                    }
                }
            }
        }

        System.out.println("The sum of primes that are both truncatable from left to right and right to left is: " +
                answer);
    }
}