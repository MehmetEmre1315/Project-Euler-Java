import java.util.ArrayList;

public class ProjectEuler003 {
    public String run(){
        long n = 600851475143L;
        ArrayList<Long> primeNumbers = Library.primeNumberFinder(n);
        return String.valueOf(primeNumbers.get(primeNumbers.size()-1));
    }
    public static void main(String[] args) {
        System.out.println("Largest prime factor of 600851475143 is:");
        System.out.println(new ProjectEuler003().run());
    }

}
