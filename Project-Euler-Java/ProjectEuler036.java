public class ProjectEuler036 {
    public String run() {
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            if (
                    Library.isPalindromeArray(Library.intToArray(i)) &&
                            Library.isPalindromeArray(Library.integerToBinaryArray(i))
            ) {
                sum += i;
                System.out.println(i);
            }
        }

        System.out.println("Sum of all numbers, less than one million, which are palindromic in base 10 " +
                " and base 2 is: " + sum);

        return Integer.toString(sum);
    }

    public static void main(String[] args) {
        new ProjectEuler036().run();
    }
}