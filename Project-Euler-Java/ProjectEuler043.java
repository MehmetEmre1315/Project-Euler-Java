import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ProjectEuler043 {
    // 1406357289
    // 1000000000

    static List<String> subString() {
        String str;
        List<String> subString = new ArrayList<>();
        for (int i = (int) Math.pow(10, 1); i < Math.pow(10, 3); i++) {
            if (i < 100) {
                // String format below will add leading zeros (the %0 syntax)
                // to the number above.
                // The length of the formatted string will be 7 characters.
                str = String.format("%03d", i);
            } else {
                str = String.valueOf(i);
            }
            HashSet<String> set = new HashSet<>(List.of(str.split("")));
            if (set.size() != 3) continue;
            subString.add(str);
        }
        return subString;
    }

    public static void main(String[] args) {
        List<String> subString = subString();

        for (int i = 0; i < subString.size(); i++) {
            System.out.println(subString.get(i));
        }
















    }
}
