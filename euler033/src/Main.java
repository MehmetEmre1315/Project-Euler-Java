public class Main {
    public static void main(String[] args) {
        int [] array = new int[81];
        int j = 0;
        for (int i = 11; i < 100; i++) {
            if (i % 10 == 0) continue;
            array[j] = i;
            j++;
        }

        int l = 1;
        int m = 1;
        for (int i = 0; i < array.length; i++) {
            for (int k = i; k < array.length; k++) {
                if (k == i) continue;
                String [] a = String.valueOf(array[i]).split("");
                String [] b = String.valueOf(array[k]).split("");

                if (a[0].equals(b[0]) || a[0].equals(b[1]) || a[1].equals(b[0]) || a[1].equals(b[1])) {
                    double n0 = (double) array[i] / array[k];

                    double n1 = Double.parseDouble(a[1]) / Double.parseDouble(b[1]);
                    double  n2 = Double.parseDouble(a[1]) / Double.parseDouble(b[0]);
                    double n3 = Double.parseDouble(a[0]) / Double.parseDouble(b[1]);
                    double n4 = Double.parseDouble(a[0]) / Double.parseDouble(b[0]);

                    if (
                            n0 == n1 && a[0].equals(b[0]) || n0 == n2 && a[0].equals(b[1]) ||
                            n0 == n3 && a[1].equals(b[0])|| n0 == n4 && a[1].equals(b[1])
                    ) {
                        l = l * array[i];
                        m *= array[k];
                        System.out.println("Numerator " +array[i] + "\n" + "Denominator " +array[k] + "\n");
                    }
                }
            }
        }

        System.out.println("The product of these four fractions"+ "\n" +"Numerator " + l + "\nDenominator " + m +
                "\n" + "If the product of these four fractions is given in its lowest common terms, " +
                "value of the denominator is :" + m / l);
    }
}