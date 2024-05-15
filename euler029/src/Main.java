import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int k = 0;
        String [] array = new String[9801];
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= 100; j++) {
                array[k] = String.valueOf(Math.pow(i, j));
                k++;
            }
        }

        //To remove multiple occurrences of the same string
        Set<String> stringHashSet = new HashSet<>(Arrays.asList(array));
        // Convert the Set to an array
        //String [] uniqueArray = stringHashSet.toArray(new String[0]);

        System.out.println("Answer: "  + stringHashSet.size());
    }
}