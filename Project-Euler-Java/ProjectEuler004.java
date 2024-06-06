public class ProjectEuler004 {
    public String run() {
        int answer = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                int product = i * j;
                if (Library.isPalindrome(product) && product > answer) answer = product;
            }
        }
        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        System.out.println(new ProjectEuler004().run());
    }




}
