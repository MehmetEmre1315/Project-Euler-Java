import java.util.Arrays;

public class Main {
    static boolean isPrime (long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        for (long i = 2L; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int answer = 0;

        // 8 and 9 digit pan-digital numbers take so much time, so it starts  from 7 digit pan-digital numbers
        for (int n = 7; n > 0; n--) {
            int[] panDigitalNumbers = new int[n];
            System.arraycopy(numbers, 0, panDigitalNumbers, 0, n);

            for (int i = (int) Math.pow(10, n); i > Math.pow(10, n - 1); i--) {
                String strNumber = String.valueOf(i);
                String[] strDigits = strNumber.split("");
                int[] digits = new int[strDigits.length];
                Arrays.sort(strDigits);

                for (int j = 0; j < strDigits.length; j++) {
                    digits[j] = Integer.parseInt(strDigits[j]);
                }

                if (Arrays.equals(digits, panDigitalNumbers) && isPrime(i)) {
                    System.out.println("Answer: " + i);
                    answer = i;
                    break;
                }
            }
            if (answer != 0) break;
        }
    }
}