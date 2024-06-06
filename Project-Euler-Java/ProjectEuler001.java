public class ProjectEuler001 {
    public int run () {
        int ans1 = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                ans1 += i;
            }
        }

        return ans1;
    }
    public static void main(String[] args) {
        System.out.println(new ProjectEuler001().run());
    }
}
