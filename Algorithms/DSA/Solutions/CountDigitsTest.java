package Algorithms.DSA.Solutions;

import org.junit.Assert;
import org.junit.Test;

public class CountDigitsTest {

    @Test
    public void testEvenlyDivides_withMultipleDigits() {
        int N = 1012;
        int result = Solution.evenlyDivides(N);
        Assert.assertEquals(3, result); // Digits 1, 1, and 2 divide 1012 evenly
    }

    @Test
    public void testEvenlyDivides_withNoDivisibleDigits() {
        int N = 123;
        int result = Solution.evenlyDivides(N);
        Assert.assertEquals(2, result); // Digits 1 and 3 divide 123 evenly
    }

    @Test
    public void testEvenlyDivides_withSingleDigit() {
        int N = 7;
        int result = Solution.evenlyDivides(N);
        Assert.assertEquals(1, result); // Only one digit 7 which divides 7 evenly
    }

    @Test
    public void testEvenlyDivides_withZero() {
        int N = 0;
        int result = Solution.evenlyDivides(N);
        Assert.assertEquals(0, result); // No digits in 0 can divide 0 evenly
    }

   

    @Test
    public void testEvenlyDivides_withAllZeroDigits() {
        int N = 1000;
        int result = Solution.evenlyDivides(N);
        Assert.assertEquals(1, result); // Only the digit 1 divides 1000 evenly
    }
}
