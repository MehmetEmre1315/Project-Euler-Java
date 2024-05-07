import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long beginTime = System.nanoTime();
        String [] digits = {"0","1","2","3","4","5","6","7","8","9"};
        List<String> lexicographicPermutations = new ArrayList<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    for (int l = 0; l < digits.length; l++) {
                        for (int m = 0; m < digits.length; m++) {
                            for (int n = 0; n < digits.length; n++) {
                                for (int o = 0; o < digits.length; o++) {
                                    for (int p = 0; p < digits.length; p++) {
                                        for (int q = 0; q < digits.length; q++) {
                                            for (int r = 0; r < digits.length; r++) {
                                                if (
                                                        i == j || i == k || i == l || i == m || i == n || i == o || i == p || i == q || i == r ||
                                                        j == k || j == l || j == m || j == n || j == o || j == p || j == q || j == r ||
                                                        k == l || k == m || k == n || k == o || k == p || k == q || k == r ||
                                                        l == m || l == n || l == o || l == p || l == q || l == r ||
                                                        m == n || m == o || m == p || m == q || m == r ||
                                                        n == o || n == p || n == q || n == r ||
                                                        o == p || o == q || o == r ||
                                                        p == q || p == r ||
                                                        q == r
                                                ) continue;
                                                String permutation = digits[i] + digits[j] + digits[k] +
                                                        digits[l] + digits[m] + digits[n] + digits[o] +
                                                        digits[p] + digits[q] + digits[r];
                                                lexicographicPermutations.add(permutation);
                                                if  (lexicographicPermutations.size() == 1000000) break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Answer: " + lexicographicPermutations.get(999999));

        long endTime = System.nanoTime();
        long elapsedTime = endTime - beginTime;
        System.out.println("Execution Time: " + ((double) elapsedTime) / 1000000000 + " seconds");
    }
}