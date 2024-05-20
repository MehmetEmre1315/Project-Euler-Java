public class Main {
    static int[] intToArray (int number) {
        String str = String.valueOf(number);
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return array;
    }
    static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        int answer = 0;
        // The maximum limit is set at 10000000. This limit is optional, may be higher
        for (int i = 3; i < 10000000; i++) {
            int[] array = intToArray(i);
            long sum = 0;
            for (int arrayNumber : array) {
                sum += factorial(arrayNumber);
            }
            if (sum == i) {
                answer += i;
                System.out.println(i);
            }
        }

        System.out.println("Sum of all numbers which are equal to the sum of the factorial of their digits:\n" + answer);
    }
}