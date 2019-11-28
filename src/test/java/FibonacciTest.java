import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FibonacciTest {

    @Test
    void testFibonacciRecursiveFirstFourValues() {
        int[][] testCases = { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 } };
        for(int[] testCase : testCases) {
            Assert.assertEquals(testCase[1], Fibonacci.fibonacci_recursive(testCase[0]));
        }
    }

    @Test
    void testIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Fibonacci.fibonacci_recursive(-2));
    }
}