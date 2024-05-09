public class Main {
    public static void main(String[] args) {
        int [] fraction = new int[100];
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

        for (int i = 7; i < denominator.length; i++){
            int j = 0;
            fraction = new int[100];
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
                    fraction = new int[100];
                    numerator = 1;
                    break;
                }else {
                    numerator = remainder;
                    j++;
                }
            }

            while (true) {
                recurringCycle = 0;
                for (int k = fraction.length - 2; k >= 0; k--) {
                    if (fraction[fraction.length - 1] == fraction[k]) {
                        recurringCycle++;
                        break;
                    } else {
                        recurringCycle++;
                    }
                }
                if (recurringCycle >= 90) break;
                if (fraction[fraction.length - 1] ==0 ) break;
                if (fraction[fraction.length - 2] == fraction[fraction.length - (recurringCycle -2)]) {
                    if (recurringCycle > maxRecurringCycle) {
                        maxRecurringCycle = recurringCycle;
                        answer = i;
                        recurringCycle = 0;
                        break;
                    } else {
                        recurringCycle = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(answer + " " + maxRecurringCycle);










    }
}