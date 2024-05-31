import java.util.ArrayList;

public class ProjectEuler009 {
    public String run() {
        int a = 3, b = 4, c = 5, ans = 0;
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < 1000; i++) numbers.add(i);

        for (int i : numbers) {
            for (int j : numbers) {
                if (i < j) {
                    a = i;
                    b = j;
                    c = (int) Math.sqrt(a * a + b * b);
                }

                if (b < c && a + b + c == 1000 && a * a + b * b == c * c) {
                    ans = a * b * c;
                    System.out.println("First: " + a + " Second: " + b + " Third: " + c);
                    System.out.println("Answer: " + ans);
                    break;
                }
            }
            if (ans != 0) break;
        }

        return Integer.toString(ans);
    }

    public static void main(String[] args){
        new ProjectEuler009().run();
    }
}
