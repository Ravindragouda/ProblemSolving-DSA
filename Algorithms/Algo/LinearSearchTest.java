package Algorithms.Algo;

import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTest {

    @Test
    public void testLinearSearch_found() {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 40;
        int result = LinearSearch.linearSearch(arr, target);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testLinearSearch_notFound() {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 70;
        int result = LinearSearch.linearSearch(arr, target);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearch_emptyArray() {
        int[] arr = {};
        int target = 40;
        int result = LinearSearch.linearSearch(arr, target);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testLinearSearch_firstElement() {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 10;
        int result = LinearSearch.linearSearch(arr, target);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testLinearSearch_lastElement() {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 60;
        int result = LinearSearch.linearSearch(arr, target);
        Assert.assertEquals(5, result);
    }
}
