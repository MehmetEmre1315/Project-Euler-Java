public class Main {
    // Method to find all rotations of a number
    static int[] rotationsOfDigits (int number) {
        String numberString = String.valueOf(number);
        int[] rotations = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            rotations[i] = Integer.parseInt(numberString.substring(i) + numberString.substring(0, i));
        }
        return rotations;
    }

    // Method to check if a number is prime
    static boolean isPrime (long number) {
        if (number < 2) return false;
        if (number == 2) return true;
        for (long i = 2L; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean prime;
        int j;
        int k = 0;

        // To find circular primes below one million
        for (int i = 0; i < 1000000; i++) {
            j = 0;
            int [] rotations = rotationsOfDigits(i);
            for (int number : rotations) {
                prime  = isPrime(number);
                if (prime) j++;
                if (j == rotations.length) {
                    k++;
                    System.out.println(i);
                }
            }
        }

        System.out.println("Number of circular primes below one million: " + k);
    }
}