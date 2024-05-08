public class Main {
    public static void main(String[] args) {
        int [] fibonacciN0 =  new int[1000];
        int [] fibonacciN1 =  new int[1000];
        int [] fibonacciN2 =  new int[1000];
        int digitCount = 1;
        int fibonacciSequence = 2;

        fibonacciN0 [0] = 1;
        fibonacciN1 [0] = 1;

        while (digitCount < 1000) {
            int carry = 0;
            for (int i = 0; i < digitCount; i++) {
                int sumOutput = fibonacciN1[i] + fibonacciN0[i] + carry;
                fibonacciN2[i] = sumOutput % 10;
                carry = sumOutput / 10;
            }
            while (carry > 0) {
                fibonacciN2[digitCount] = carry % 10;
                carry /= 10;
                digitCount++;
            }
            fibonacciN0 = fibonacciN1;
            fibonacciN1 = fibonacciN2;
            fibonacciSequence++;

            fibonacciN2 = new int[1000];
        }

        System.out.println("Fibonacci sequence, The " + fibonacciSequence + "th term contain " + digitCount + " digits");
        System.out.println(fibonacciSequence + "th term:");
        for (int i = digitCount - 1; i >= 0; i--) {
            System.out.print(fibonacciN1[i]);
        }
    }
}