public class Main {
    static int [] integerToBinaryArray (int number) {
        int [] array = new int[10000];
        int digitCount = 0;

        int j = 0;
        while (number > 0) {
            array[j] = number % 2;
            number /= 2;
            digitCount++;
            j++;

        }
        int [] result = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            result[i] = array[(digitCount - 1) - i];
        }
        return result;
    }

    static int [] integerToArray (int number) {
        String str = String.valueOf(number);
        int [] array = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return array;
    }

    static boolean isPalindrome (int [] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[(array.length - 1) - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            if (isPalindrome(integerToArray(i)) && isPalindrome(integerToBinaryArray(i))) {
                sum += i;
                System.out.println(i);
            }
        }

        System.out.println("Sum of all numbers, less than one million, which are palindromic in base 10 " +
                " and base 2 is: " + sum);
    }
}