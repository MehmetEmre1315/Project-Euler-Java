public class ProjectEuler028 {
    public String run() {
        int [][] numbers = new int[1001][1001];
        int [] middle = Library.findMiddleInArray(numbers);

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

        System.out.println("Answer: " + Library.sumOfArray(numbers));
        return String.valueOf(Library.sumOfArray(numbers));
    }

    public static void main(String[] args) {
        new ProjectEuler028().run();
    }
}