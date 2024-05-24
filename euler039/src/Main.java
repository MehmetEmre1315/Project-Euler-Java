import java.util.Arrays;

public class Main {
    static int[] hypotenuseAndPerimeter(int a, int b) {
        int hypotenuse = (int) Math.sqrt(a * a + b * b);
        int perimeter = a + b + hypotenuse;
        if (a * a + b * b != hypotenuse * hypotenuse) {
            return new int[]{0, 0, 0, 0};
        }
        return new int[]{perimeter, a, b, hypotenuse};
    }
    public static void main(String[] args) {
        int [] perimeters = new int[1000];
        int l = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                if (hypotenuseAndPerimeter(i, j)[0] > 1000) break;
                if (hypotenuseAndPerimeter(i, j)[0] != 0) {
                    perimeters[l] = hypotenuseAndPerimeter(i, j)[0];
                    l++;
                }
            }
        }

        // To find the maximum number of occurrences in an array containing repeating elements
        Arrays.sort(perimeters);
        int n0 = 0;
        int n1 = 0;
        int n2 = 0 ;
        for (int i = 1; i < perimeters.length; i++) {
            if (perimeters[i] == 0) continue;
            if (perimeters[i] == perimeters[i - 1]) {
                n0++;
                if (n0 > n1) {
                    n1 = n0;
                    n0 = 0;
                    n2 = perimeters[i];
                }
            } else {
                n0 = 0;
            }
        }

        System.out.println("Answer is: " + n2 + " with " + n1 + " solutions");
    }
}