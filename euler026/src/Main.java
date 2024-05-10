public class Main {
    public static void main(String[] args) {
        int [] fraction = new int[1000];
        int numerator = 1;
        int remainder = 0;
        int [] denominator = new int[1000];

        for (int i = 0; i < 1000; i++) {
            denominator[i] = i;
        }
        denominator[0] = 1;

        int recurringCycle = 0;
        int maxRecurringCycle = 0;
        int answer = 0;

        for (int i = 7; i < denominator.length; i++) {
            int j = 0;
            fraction = new int[1000];
            numerator = 1;
            while (j < fraction.length) {
                while (numerator < denominator[i]) {
                    numerator *= 10;
                    if (numerator >= 100 && j < fraction.length - 1) {
                        j++;
                    }
                }

                fraction[j] = numerator / denominator[i];
                remainder = numerator % denominator[i];

                if (remainder == 0) {
                    fraction = new int[1000];
                    numerator = 1;
                    break;
                } else {
                    numerator = remainder;
                    j++;
                }
            }

            if (
                    fraction[fraction.length - 1] == fraction[fraction.length - 100]
                    && fraction[fraction.length - 1] == 0
            ) continue;


















        }

    }
}