public class ProjectEuler026 {
    public String run() {
        int [] fraction;
        int numerator;
        int remainder;
        int [] denominator = new int[1000];

        // Denominators 1 to 999
        for (int i = 0; i < 1000; i++) {
            denominator[i] = i;
        }
        denominator[0] = 1;

        int recurringCycle = 0;
        int maxRecurringCycle = 0;
        int answer = 0;

        // Loop through all denominators
        // Output fraction value goes into array
        for (int i = 0; i < denominator.length; i++) {
            int j = 0;
            int l = 0;
            fraction = new int[10000];
            numerator = 1;
            while (j < fraction.length) {
                while (numerator < denominator[i]) {
                    l++;
                    numerator *= 10;
                    if (l >= 2 && j < fraction.length - 1) {
                        j++;
                    }
                }
                l = 0;

                fraction[j] = numerator / denominator[i];
                remainder = numerator % denominator[i];

                if (remainder == 0) {
                    fraction = new int[10000];
                    break;
                } else {
                    numerator = remainder;
                    j++;
                }
            }

            // To eliminate recurring 0's at the end of the fraction
            if (
                    fraction[fraction.length - 1] == 0 &&
                            fraction[fraction.length - 2] == 0 &&
                            fraction[fraction.length - 3] == 0 &&
                            fraction[fraction.length - 4] == 0 &&
                            fraction[fraction.length - 5] == 0

            ) continue;

            // Loop through the fraction to find recurring cycle
            for (int k = fraction.length - 2; k > 0; k--) {
                if (
                    //fraction[fraction.length - 1] == fraction[k] &&
                        fraction[fraction.length - 2] == fraction[k - 1] &&
                                fraction[fraction.length - 3] == fraction[k - 2] &&
                                fraction[fraction.length - 4] == fraction[k - 3] &&
                                fraction[fraction.length - 5] == fraction[k - 4]
                ) {
                    recurringCycle ++;
                    // To see every single recurring cycle
                    System.out.println("Number "+ i + " has recurring cycle of " + recurringCycle);
                    if (recurringCycle > maxRecurringCycle) {
                        maxRecurringCycle = recurringCycle;
                        answer = i;
                    }
                    recurringCycle = 0;
                    break;
                } else {
                    recurringCycle ++;
                }
                if (k < 20) {

                    recurringCycle = 0;
                    break;
                }
            }
        }

        System.out.println("\nAnswer is number " + answer + " with recurring cycle of " + maxRecurringCycle);
        return Integer.toString(answer);
    }
    public static void main(String[] args) {
        new ProjectEuler026().run();
    }
}