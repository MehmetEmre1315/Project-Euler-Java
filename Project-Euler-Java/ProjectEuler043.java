import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ProjectEuler043 {
    // Generate 3 length String integer 012 to 987. Duplicate contain numbers are excluded.
    static List<String> subString() {
        String str;
        List<String> subString = new ArrayList<>();
        for (int i = (int) Math.pow(10, 1); i < Math.pow(10, 3); i++) {
            if (i < 100) {
                // String format below will add leading zeros (the %0 syntax)
                // The length of the formatted string will be 3 characters.
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

    // Compare "012" and "126".
    static boolean compareLast2AndFirst2For3Length (String str1, String str2) {
        return str1.substring(1, 3).equals(str2.substring(0, 2));
    }

    // return true if string not contain duplicate. String length must be 9.
    static boolean checkContainDuplicateFor9Length (String str) {
        HashSet<String> set = new HashSet<>(List.of(str.split("")));
        return set.size() == 9;
    }

    // Return digit of merged divisible, controlled for containing duplicate.
    static List<String> mergedDivisible() {
        List<String> subString = subString();
        List<String> divisibleBy2 = new ArrayList<>();
        List<String> divisibleBy3 = new ArrayList<>();
        List<String> divisibleBy5 = new ArrayList<>();
        List<String> divisibleBy7 = new ArrayList<>();
        List<String> divisibleBy11 = new ArrayList<>();
        List<String> divisibleBy13 = new ArrayList<>();
        List<String> divisibleBy17 = new ArrayList<>();

        for (String s : subString) {
            if (Integer.parseInt(s) % 2 == 0) {
                divisibleBy2.add(s);
            }
            if (Integer.parseInt(s) % 3 == 0) {
                divisibleBy3.add(s);
            }
            if (Integer.parseInt(s) % 5 == 0) {
                divisibleBy5.add(s);
            }
            if (Integer.parseInt(s) % 7 == 0) {
                divisibleBy7.add(s);
            }
            if (Integer.parseInt(s) % 11 == 0) {
                divisibleBy11.add(s);
            }
            if (Integer.parseInt(s) % 13 == 0) {
                divisibleBy13.add(s);
            }
            if (Integer.parseInt(s) % 17 == 0) {
                divisibleBy17.add(s);
            }
        }

        List<String> mergedDivisibleToNumber = new ArrayList<>();
        for (String by2 : divisibleBy2) {
            for (String by3 : divisibleBy3) {
                if (compareLast2AndFirst2For3Length(by2, by3)) {
                    for (String by5 : divisibleBy5) {
                        if (compareLast2AndFirst2For3Length(by3, by5)) {
                            for (String by7 : divisibleBy7) {
                                if (compareLast2AndFirst2For3Length(by5, by7)) {
                                    for (String by11 : divisibleBy11) {
                                        if (compareLast2AndFirst2For3Length(by7, by11)) {
                                            for (String by13 : divisibleBy13) {
                                                if (compareLast2AndFirst2For3Length(by11, by13)) {
                                                    for (String by17 : divisibleBy17) {
                                                        if (compareLast2AndFirst2For3Length(by13, by17)) {
                                                            String byFinal =
                                                                            by2 +
                                                                            by3.substring(2) +
                                                                            by5.substring(2) +
                                                                            by7.substring(2) +
                                                                            by11.substring(2) +
                                                                            by13.substring(2) +
                                                                            by17.substring(2);
                                                            if (checkContainDuplicateFor9Length(byFinal)) {
                                                                mergedDivisibleToNumber.add(byFinal);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return mergedDivisibleToNumber;
    }

    // Return 0 to 9 pandigital number
    static String complete1DigitMissingPandigital(String str) {
        String [] pandigital = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String [] strArray = str.split("");
        Arrays.sort(strArray);
        String missingDigit = null;

        for (int i = 0; i < pandigital.length; i++) {
            if (!strArray[i].equals(pandigital[i])) {
                missingDigit = pandigital[i];
                missingDigit = missingDigit + str;
                break;
            }
        }

        return missingDigit;
    }

    public String run() {
        List<String> mergedDivisibleToNumber = mergedDivisible();
        List<String> pandigital = new ArrayList<>();
        long sum = 0;
        for (String s : mergedDivisibleToNumber) {
            sum += Long.parseLong(complete1DigitMissingPandigital(s));
            pandigital.add(complete1DigitMissingPandigital(s));
        }
        System.out.println("Pandigital numbers: " + pandigital);
        System.out.println("Answer: " + sum);

        return String.valueOf(sum);
    }

    public static void main(String[] args) {
        new ProjectEuler043().run();
    }
}