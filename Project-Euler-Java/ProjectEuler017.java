import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProjectEuler017 {
    static String twoDigitNumberWriting (int number) {
        String numberToWriting;

        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(0, "zero");
        integerStringHashMap.put(1, "one");
        integerStringHashMap.put(2, "two");
        integerStringHashMap.put(3, "three");
        integerStringHashMap.put(4, "four");
        integerStringHashMap.put(5, "five");
        integerStringHashMap.put(6, "six");
        integerStringHashMap.put(7, "seven");
        integerStringHashMap.put(8, "eight");
        integerStringHashMap.put(9, "nine");

        integerStringHashMap.put(10, "ten");
        integerStringHashMap.put(11, "eleven");
        integerStringHashMap.put(12, "twelve");
        integerStringHashMap.put(13, "thirteen");
        integerStringHashMap.put(14, "fourteen");
        integerStringHashMap.put(15, "fifteen");
        integerStringHashMap.put(16, "sixteen");
        integerStringHashMap.put(17, "seventeen");
        integerStringHashMap.put(18, "eighteen");
        integerStringHashMap.put(19, "nineteen");

        integerStringHashMap.put(20, "twenty");
        integerStringHashMap.put(30, "thirty");
        integerStringHashMap.put(40, "forty");
        integerStringHashMap.put(50, "fifty");
        integerStringHashMap.put(60, "sixty");
        integerStringHashMap.put(70, "seventy");
        integerStringHashMap.put(80, "eighty");
        integerStringHashMap.put(90, "ninety");

        if (number <= 20) {
            numberToWriting = integerStringHashMap.get(number);
        }else if (number > 21 && number % 10 == 0) {
            numberToWriting = integerStringHashMap.get(number);
        }else {
            int firstDigit = number / 10;
            int secondDigit = number % 10;
            numberToWriting = (integerStringHashMap.get(firstDigit * 10) + integerStringHashMap.get(secondDigit));
        }
        return numberToWriting;
    }

    static String threeDigitNumberWriting (int number) {
        String numberToWriting;
        String and = "and";

        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(0, "zero");
        integerStringHashMap.put(1, "one");
        integerStringHashMap.put(2, "two");
        integerStringHashMap.put(3, "three");
        integerStringHashMap.put(4, "four");
        integerStringHashMap.put(5, "five");
        integerStringHashMap.put(6, "six");
        integerStringHashMap.put(7, "seven");
        integerStringHashMap.put(8, "eight");
        integerStringHashMap.put(9, "nine");

        integerStringHashMap.put(100, "hundred");

        int firstDigit = number / 100;
        int secondDigit = number - firstDigit * 100;
        if (secondDigit == 0) {
            numberToWriting = (integerStringHashMap.get(firstDigit) + integerStringHashMap.get(100));
        }else {
            numberToWriting = (integerStringHashMap.get(firstDigit) + integerStringHashMap.get(100) + and + twoDigitNumberWriting(secondDigit));
        }
        return numberToWriting;
    }

    public String run() {
        String numberToWriting = "";
        List<Integer> numbers = new ArrayList<>();
        List<String> numberToWritings = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }

        for (int n : numbers) {
            if (n < 100) {
                numberToWriting = twoDigitNumberWriting(n);
            }else if (n< 1000) {
                numberToWriting = threeDigitNumberWriting(n);
            }else if (n == 1000) {
                numberToWriting = "onethousand";
            }
            numberToWritings.add(numberToWriting);
        }

        int answer = 0;
        for (String s : numberToWritings) {
            answer += s.length();
        }
        System.out.println("Answer: " + answer); //21124
        return Integer.toString(answer);
    }

    public static void main(String[] args) {
        new ProjectEuler017().run();
    }
}