import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class Library {

    // Check if n is prime
    public static boolean isPrime (long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        for (long i = 2L; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    // Max n value is 9
    // Return n digit pan digital numbers array
    // n = 9 takes too much time, don't use for 9
    public static int[] nDigitPan (int n) {
        int[] array = new int[100000];
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] panDigitalNumbers = new int[n];
        System.arraycopy(numbers, 0, panDigitalNumbers, 0, n);

        int k = 0;
        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            String strNumber = String.valueOf(i);
            String[] strDigits = strNumber.split("");
            int[] digits = new int[strDigits.length];
            Arrays.sort(strDigits);

            for (int j = 0; j < strDigits.length; j++) {
                digits[j] = Integer.parseInt(strDigits[j]);
            }

            if (Arrays.equals(digits, panDigitalNumbers)) {
                array[k] = i;
                k++;
            }
        }

        int [] result = new int[k];
        System.arraycopy(array, 0, result, 0, k);

        return result;
    }

    // Check if n is palindrome
    public static boolean isPalindrome (long n) {
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        return str.contentEquals(sb.reverse());
    }

    // Return array list of prime numbers factor of n
    public static ArrayList<Integer> primeNumberFinder(long n){
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                primeNumbers.add(i);
                n /= i;
                i = 1;
            }
        }
        return primeNumbers;
    }

    // return lowest common multiple integer of two integers a and b
    public static int leastCommonMultiple(int a, int b) {
        List<Integer> arrayA = new ArrayList<>();
        List<Integer> arrayB = new ArrayList<>();
        int i = 1;
        while (true) {
            arrayA.add(a * i);
            arrayB.add(b * i);
            if (arrayA.contains(b * i)) {
                return b * i;
            } else if (arrayB.contains(a * i)) {
                return a * i;
            }
            i++;
        }
    }

}
