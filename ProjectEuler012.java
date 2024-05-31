public class ProjectEuler012 {
    static long triangularNumberFormula(long n) {
        return (n * (n + 1)) / 2;
    }
    public String run() {
        long i = 0L;
        while (true) {
            int factorCount = Library.getFactors(triangularNumberFormula(i)).size();
            if (factorCount >= 500) {
                System.out.println("Answer: " + triangularNumberFormula(i));
                break;
            }
            i++;
        }
        return String.valueOf(triangularNumberFormula(i));
    }
    public static void main(String[] args) {
        new ProjectEuler012().run();
    }
}