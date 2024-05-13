import java.util.Arrays;

public class Main {
    static int [] findMiddleInArray (int [][] array) {
        return new int[]{array.length / 2, array[0].length / 2};
    }

    // Sum of integers in a two-dimensional array
    static long sumOfArray (int [][] array) {
        return Arrays.stream(array).flatMapToInt(Arrays::stream).sum();
    }
    public static void main(String[] args) {
        int [][] numbers = new int[1001][1001];
        int [] middle = findMiddleInArray(numbers);

        int j = 0;
        int k = numbers.length;
        for (int i = numbers.length - 1; i >= 0; i --){
            numbers [j][i] = k * k;
            numbers [j][j] = numbers [j][i] - k + 1;
            numbers [i][j] = numbers [j][j] - k + 1;
            numbers [i][i] = numbers [i][j] - k + 1;
            j++;
            k -= 2;
            if (numbers[middle[0]][middle[1]] != 0) break;
        }

        System.out.println("Answer: " + sumOfArray(numbers));
    }
}