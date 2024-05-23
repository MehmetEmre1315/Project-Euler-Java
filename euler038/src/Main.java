import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Long> pandigitalNumberList = new ArrayList<>();
        // Number
        for (int i = 0; i < 100000; i++) {
            StringBuilder pandigitalNumber = new StringBuilder();

            // Multiplier numbers
            for (int j = 1; j < 100; j++) {
                pandigitalNumber.append(i * j);
                if (pandigitalNumber.length() == 9) {
                    String [] strArray = pandigitalNumber.toString().split("");
                    HashSet<String> strSet = new HashSet<>(Arrays.asList(strArray));
                    if (strSet.contains("0")) break;
                    if (strSet.size() == 9) {
                        System.out.println("Number " + i + "\n" + "Max Multiplier " + j + "\n" + pandigitalNumber);
                        if (i > 1) pandigitalNumberList.add(Long.parseLong(pandigitalNumber.toString()));
                        break;
                    }
                } else if (pandigitalNumber.length() > 9) break;
            }
        }

        pandigitalNumberList.sort(null);
        System.out.println("Answer is " + pandigitalNumberList.get(pandigitalNumberList.size() - 1));





    }
}