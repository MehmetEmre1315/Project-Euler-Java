import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ProjectEuler022 {
    private static final File myObj = new File("C:\\2024_Kodlama\\Coding\\Java\\IntelliJ\\Project-Euler-Solutions\\Project-Euler-Java\\ProjectEuler022Names.txt");
    public String run() {

        String data = null;
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String [] names = new String[0];
        if (data != null) {
            names = data.split(",");
        }

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].substring(1, names[i].length() - 1);
        }

        Arrays.sort(names);

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

        long answer = 0L;
        long eachNameScore = 0;

        for (int i = 0; i < names.length; i++) {
            String[] nameLetters = names[i].split("");
            for (String nameLetter : nameLetters) {
                eachNameScore += letterValues.get(nameLetter);
            }
            eachNameScore *= (i + 1);
            answer += eachNameScore;
            eachNameScore = 0;
        }

        System.out.println("Answer: " + answer);
        return Long.toString(answer);
    }
    public static void main(String[] args) {
        new ProjectEuler022().run();
    }
}