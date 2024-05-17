import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> oneToNine = new ArrayList<>();
        List<Integer> products = new ArrayList<>();
        List<Integer> multiplicand = new ArrayList<>();
        List<Integer> multiplier = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            for (int j = i; j < 10000; j++){
                int n2 = i * j;

                String s0 = String.valueOf(i);
                String s1 = String.valueOf(j);
                String s2 = String.valueOf(n2);
                String s3 = s0 + s1 + s2;
                oneToNine.clear();

                if (s3.length() < 9) continue;
                if (s3.length() > 9) break;
                for (int k = 0; k < s3.length(); k++) {
                    oneToNine.add(Integer.parseInt(String.valueOf(s3.charAt(k))));
                }
                HashSet<Integer> oneToNineSet = new HashSet<>(oneToNine);
                if (oneToNineSet.contains(0)) continue;
                if (oneToNineSet.size() == 9) {
                    multiplicand.add(i);
                    multiplier.add(j);
                    products.add(n2);
                }
            }
        }

        // Eliminate duplicate values and make a list of unique values
        List<Integer> uniqueProducts = new ArrayList<>(new HashSet<>(products));
        // Sum the unique values
        int answer = uniqueProducts.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Multiplicand: \n" + multiplicand);
        System.out.println("Multiplier: \n" + multiplier);
        System.out.println("Products: \n" + products);
        System.out.println("Answer: " + answer);
    }
}