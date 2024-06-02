import java.math.BigInteger;
import java.util.Arrays;

public class ProjectEuler016 {
    public String run() {
        int exponent = 1000;
        BigInteger[] powerOf2 = new BigInteger[exponent];
        Arrays.fill(powerOf2, BigInteger.valueOf(2));

        for (int i = 1; i < exponent; i++) {
            powerOf2[i] = powerOf2[i - 1].multiply(BigInteger.valueOf(2));
        }

        String exponent1000 = powerOf2[1000 - 1].toString();
        int answer = 0;
        for (int i = 0; i < exponent1000.length(); i++) {
            answer += Integer.parseInt(String.valueOf(exponent1000.charAt(i)));
        }
        System.out.println("Answer: " + answer);
        return Integer.toString(answer);
    }
    public static void main(String[] args) {
        new  ProjectEuler016().run();
    }
}