public class Main {
    static int [] numberToArray (int number) {

        String numberString = String.valueOf(number);
        int [] numberArray = new int[numberString.length()];
        for (int i = 0; i < numberString.length(); i++) {
            numberArray[i] = Integer.parseInt(String.valueOf(numberString.charAt(i)));
        }
        return numberArray;
    }

    public static void main(String[] args) {
        int i = 2;
        long n;
        long sum = 0;
        int answer = 0;
        while (true) {
            int [] numberArray = numberToArray(i);
            for (Integer number : numberArray) {
                n = (long) Math.pow(number, 5);
                sum += n;
            }
            if (sum == i) {
                answer += sum;
                System.out.println("number " + i);
            }
            sum = 0;
            i++;
            if (numberArray.length == 7) {
                break;
            }
        }
        System.out.println("Answer: " + answer);
    }
}