public class ProjectEuler027 {
    static int quadraticFormula (int n, int a, int b) {
        return (n * n) + (a * n) + b;
    }

    public String run() {
        int [] arrayA = new int[1999];
        int [] arrayB = new int[2001];
        int [] arrayN = new int[101];
        int [] answer = new int[3];

        for (int i = -1000; i <= 1000; i++) {
            if (i >= 0 && i <= 100) arrayN[i] = i;
            arrayB[i + 1000] = i;
            if (i == -1000 || i == 1000) continue;
            arrayA[i + 999] = i;
        }

        for (int b : arrayB) {
            for (int a : arrayA) {
                for (int n : arrayN) {
                    if (n == 0 && !Library.isPrime(quadraticFormula(n, a, b))) break;
                    if (Library.isPrime(quadraticFormula(n, a, b))) {
                        if (n > answer[0]) {
                            answer[0] = n;
                            answer[1] = a;
                            answer[2] = b;
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        System.out.println(
                "n^2 + " + answer[1] + "n + " + answer[2] +
                        " produces the maximum number of primes for consecutive values of n, starting at n = 0." +
                        " Maximum number of n = " + answer[0] + "." + "\n" +
                        "Product of a and b = " + (answer[1] * answer[2]));
        return String.valueOf((answer[1] * answer[2]));
    }

    public static void main(String[] args) {
        new ProjectEuler027().run();
    }
}