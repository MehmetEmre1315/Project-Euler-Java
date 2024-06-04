public class ProjectEuler020 {
    public String run() {
        int factorialN = 100;
        int [] bigNumberInArray = new int[250];
        bigNumberInArray[0] = 1;
        int bigNumberInArraySize = 1;

        for (int i = 2; i <= factorialN; i++) {
            int carry = 0;
            for (int j = 0; j < bigNumberInArraySize; j++) {
                int multiplyOutput = bigNumberInArray[j] * i + carry;
                bigNumberInArray[j] = multiplyOutput % 10;
                carry = multiplyOutput / 10;
            }
            while (carry > 0) {
                bigNumberInArray[bigNumberInArraySize] = carry % 10;
                carry = carry / 10;
                bigNumberInArraySize++;
            }
        }

        System.out.println("Factorial of " + factorialN + " is ");
        for (int i = bigNumberInArraySize - 1; i >= 0; i--) {
            System.out.print(bigNumberInArray[i]);
        }

        int answer = 0;
        for (int i = bigNumberInArraySize - 1; i >= 0; i--) {
            answer += bigNumberInArray[i];
        }

        System.out.println("\nAnswer is " + answer);
        return String.valueOf(answer);
    }
    public static void main(String[] args) {
        new ProjectEuler020().run();
    }
}