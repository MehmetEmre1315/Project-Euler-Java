import java.util.HashMap;

public class ProjectEuler019 {
    public String run() {
        int[] yearArray = new int[100];
        for (int i = 1901; i <= 2000; i++) {
            yearArray[i - 1901] = i;
        }

        int[] monthArray = new int[12];
        for (int i = 1; i <= 12; i++) {
            monthArray[i - 1] = i;
        }

        int[] dayArray = new int[31];
        for (int i = 1; i <= 31; i++) {
            dayArray[i - 1] = i;
        }

        HashMap<Integer, String> integerDaysHashMap = new HashMap<>();
        integerDaysHashMap.put(6, "Sunday");
        integerDaysHashMap.put(0, "Monday");
        integerDaysHashMap.put(1, "Tuesday");
        integerDaysHashMap.put(2, "Wednesday");
        integerDaysHashMap.put(3, "Thursday");
        integerDaysHashMap.put(4, "Friday");
        integerDaysHashMap.put(5, "Saturday");

        int dayCount = 0;
        String dayName;
        int answer = 0;

        for (int year : yearArray) {
            for (int month : monthArray) {
                for (int day : dayArray) {
                    if (day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) {
                        continue;
                    }
                    if (year % 100 == 0 && year % 400 == 0 && month == 2 && day == 29) {
                        dayCount++;
                        dayName = integerDaysHashMap.get(dayCount % 7);
                        System.out.println(dayName + " " + day + "." + month + "." + year);

                        /*
                        If the year 1900 is included, include this, otherwise this is not necessary
                        if (day == 1 && dayName.equals("Sunday"))
                            answer++;
                         */
                        continue;
                    }
                    if (year % 100 == 0 && month == 2 && day > 28) {
                        continue;
                    }
                    if (year % 4 == 0 && month == 2 && day > 29) {
                        continue;
                    } else if (year % 4 != 0 && month == 2 && day > 28) {
                        continue;
                    }
                    dayCount++;
                    dayName = integerDaysHashMap.get(dayCount % 7);
                    System.out.println(dayName + " " + day + "." + month + "." + year);
                    if (day == 1 && dayName.equals("Sunday"))
                        answer++;
                }
            }
        }

        System.out.println("Answer: " + answer);
        return Integer.toString(answer);
    }
    public static void main(String[] args) {
        new ProjectEuler019().run();
    }
}