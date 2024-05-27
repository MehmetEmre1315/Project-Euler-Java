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

}
