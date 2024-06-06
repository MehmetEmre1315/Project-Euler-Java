public class ProjectEuler006 {
    private static final int number = 100;

    public String run() {
        long n0;
        long n1 = 0;
        long n2 = 0;
        long n3;

        for (int i = 1; i <= number; i++) {
            n0 = (long) Math.pow(i, 2);
            n1 += n0;
        }

        for (int i = 1; i <= number; i++) {
            n2 += i;
        }

        n3 = (long) Math.pow(n2, 2);

        System.out.println("The sum of the squares of the first ten natural numbers is: " + n1);
        System.out.println("The square of the sum of the first ten natural numbers is: " + n3);
        System.out.println("the difference between the sum of the squares of the first ten natural numbers and" +
                " the square of the sum is: " + (n3 - n1));

        return String.valueOf(n3 - n1);
    }

    public static void main(String[] args) {
        new ProjectEuler006().run();
    }
}
