public class ProjectEuler040 {
    public String run() {
        int [] array = new int[1000100];

        int i = 0;
        int j = 1;
        while (true) {
            // Convert integer to String then String array
            String str = Integer.toString(j);
            String [] strArray = str.split("");

            if (i + strArray.length > array.length) break;
            for (String s : strArray) {
                array[i] = Integer.parseInt(s);
                i++;
            }
            j++;
        }

        int product = array[0] * array[9] * array[99] * array[999] * array[9999] * array[99999] * array[999999];
        System.out.println("Product is: " + product);

        return String.valueOf(product);
    }
    public static void main(String[] args) {
        new ProjectEuler040().run();
    }
}