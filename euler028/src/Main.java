public class Main {
    static int [] findMiddleInArray (int [][] array) {
        return new int[]{array.length / 2, array[0].length / 2};
    }
    public static void main(String[] args) {
        int [][] numbers = new int[5][5];
        int [] middle = findMiddleInArray(numbers);
        numbers[middle[0]][middle[1]] = 1;















    }
}