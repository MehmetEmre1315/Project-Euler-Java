import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ProjectEuler042 {
    private static final File myObj = new File("C:\\2024_Kodlama\\Coding\\Java\\IntelliJ\\Project-Euler-Solutions\\Project-Euler-Java\\ProjectEuler042_words.txt");
    // Read text file, return String
    static String fileToString() {
        String data = null;
        try {
            Scanner myReader = new Scanner(ProjectEuler042.myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
    // Split a string into an array of strings based on regex
    // For this text, each word is in double quotes; for loop remove double quotes
    static String[] stringToArray(String data) {

        String [] words = new String[0];
        if (data != null) {
            words = data.split(",");
        }
        // To remove double quotation marks
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(1, words[i].length() - 1);
        }
        return words;
    }

    static int wordValue(String word) {
        HashMap<String, Integer> letterValues = new HashMap<>();
        letterValues.put("A", 1);
        letterValues.put("B", 2);
        letterValues.put("C", 3);
        letterValues.put("D", 4);
        letterValues.put("E", 5);
        letterValues.put("F", 6);
        letterValues.put("G", 7);
        letterValues.put("H", 8);
        letterValues.put("I", 9);
        letterValues.put("J", 10);
        letterValues.put("K", 11);
        letterValues.put("L", 12);
        letterValues.put("M", 13);
        letterValues.put("N", 14);
        letterValues.put("O", 15);
        letterValues.put("P", 16);
        letterValues.put("Q", 17);
        letterValues.put("R", 18);
        letterValues.put("S", 19);
        letterValues.put("T", 20);
        letterValues.put("U", 21);
        letterValues.put("V", 22);
        letterValues.put("W", 23);
        letterValues.put("X", 24);
        letterValues.put("Y", 25);
        letterValues.put("Z", 26);

        int wordValueInt = 0;
        String[] wordLetters = word.split("");
        for (String wordLetter : wordLetters) {
            wordValueInt += letterValues.get(wordLetter);
        }
        return wordValueInt;
    }
    public String run() {
        String data = fileToString();
        String[] words = stringToArray(data);

        List<Integer> alphabeticalPositionNumber = new ArrayList<>();
        for (String word : words) {
            alphabeticalPositionNumber.add(wordValue(word));
        }

        int alphabeticalPositionNumberMax = alphabeticalPositionNumber.stream().mapToInt(Integer::intValue).max().orElseThrow();
        List<Integer> triangleNumbers = new ArrayList<>();
        int n = 1;
        while (true) {
            triangleNumbers.add(n * (n + 1) / 2);
            n++;
            if (triangleNumbers.get(triangleNumbers.size()-1) > alphabeticalPositionNumberMax) {
                triangleNumbers.remove(triangleNumbers.size()-1);
                break;
            }
        }

        int count = 0;
        for (int i : alphabeticalPositionNumber) {
            if (triangleNumbers.contains(i)) {
                count++;
            }
        }

        System.out.println("Answer: " + count);
        return String.valueOf(count);
    }

    public static void main(String[] args) {
        new ProjectEuler042().run();
    }
}
