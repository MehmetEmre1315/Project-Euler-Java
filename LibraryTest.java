import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibraryTest {
    @Test
    public void testIsPrime () {
        assertTrue(Library.isPrime(7));
        assertTrue(Library.isPrime(11));
        assertTrue(Library.isPrime(13));
    }

    @Test
    public void testNDigitPan () {
        assertEquals(12345, Library.nDigitPan(5)[0]);
    }

    @Test
    public void testPrimeNumberFinder () {
        assertEquals(5, Library.primeNumberFinder(13195).get(0));
        assertEquals(7, Library.primeNumberFinder(13195).get(1));
        assertEquals(13, Library.primeNumberFinder(13195).get(2));
        assertEquals(29, Library.primeNumberFinder(13195).get(3));
    }

}
