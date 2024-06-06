public class ProjectEuler035 {
    public String run() {
        boolean prime;
        int j;
        int k = 0;

        // To find circular primes below one million
        for (int i = 0; i < 1000000; i++) {
            j = 0;
            int [] rotations = Library.rotationsOfDigits(i);
            for (int number : rotations) {
                prime  = Library.isPrime(number);
                if (prime) j++;
                if (j == rotations.length) {
                    k++;
                    System.out.println(i);
                }
            }
        }

        System.out.println("Number of circular primes below one million: " + k);
        return Integer.toString(k);
    }

    public static void main(String[] args) {
        new  ProjectEuler035().run();
    }
}