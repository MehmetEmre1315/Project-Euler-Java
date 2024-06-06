import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    public void testIsPalindrome () {
        assertTrue(Library.isPalindrome(9009));
    }
    @Test
    public void testIsPalindrome1 () {
        int [] array = {9,0,0,9};
        assertTrue(Library.isPalindromeArray(array));
    }
    @Test
    public void testPrimeNumberFinder () {
        assertEquals(5, Library.primeNumberFinder(13195).get(0));
        assertEquals(7, Library.primeNumberFinder(13195).get(1));
        assertEquals(13, Library.primeNumberFinder(13195).get(2));
        assertEquals(29, Library.primeNumberFinder(13195).get(3));
    }
    @Test
    public void testLeastCommonMultiple() {
        assertEquals(12, Library.leastCommonMultiple(4, 6));
    }
    @Test
    public void testGetFactors() {
        assertEquals(6, Library.getFactors(28).size());
    }
    @Test
    public void testSumOfDividers() {
        assertEquals(284, Library.sumOfDividers(220));
    }
    @Test
    public void testSumOfArray() {
        int [][] twoDimensionalArray = {{1,2,3}, {10,20,30}};
        assertEquals(66, Library.sumOfArray(twoDimensionalArray));
    }
    @Test
    public void testFindMiddleInArray() {
        int [][] twoDimensionalArray = {{0,0,0}, {0,10,0}};
        assertEquals(1, Library.findMiddleInArray(twoDimensionalArray)[0]);
        assertEquals(1, Library.findMiddleInArray(twoDimensionalArray)[1]);
    }
    @Test
    public void testFactorial() {
        assertEquals(120, Library.factorial(5));
    }
    @Test
    public void testIntToArray() {
        assertEquals(8, Library.intToArray(852)[0]);
    }
    @Test
    public void testRotationsOfDigits() {
        assertEquals(197,Library.rotationsOfDigits(197)[0]);
        assertEquals(971, Library.rotationsOfDigits(197)[1]);
        assertEquals(719, Library.rotationsOfDigits(197)[2]);
    }
    @Test
    public void testIntegerToBinaryArray() {
        assertEquals(1, Library.integerToBinaryArray(5)[0]);
        assertEquals(0, Library.integerToBinaryArray(5)[1]);
        assertEquals(1, Library.integerToBinaryArray(5)[2]);
    }
    @Test
    public void testRemoveDigitRightAndLeft() {
        int [] array = Library.removeDigitRightAndLeft(3797);
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(797);
        list1.add(97);
        list1.add(7);
        list1.add(379);
        list1.add(37);
        list1.add(3);

        for (int i : array) {
            list.add(i);
        }
        assertTrue(list.containsAll(list1));
    }

}
