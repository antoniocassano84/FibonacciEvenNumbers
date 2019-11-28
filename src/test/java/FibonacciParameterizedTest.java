import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.Function;
import java.util.stream.Stream;

public class FibonacciParameterizedTest {
    @ParameterizedTest
    @MethodSource("getSource")
    void whenNegativeValue_thenThrowException(Function<Long, Long> function, Long value) {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> function.apply(value));
    }

    private static Stream<Arguments> getSource() {
        Function<Long, Long> first = Fibonacci::fibonacci_plain;
        Function<Long, Long> second = Fibonacci::fibonacci_recursive;
        Function<Long, Long> third = Fibonacci::fibonacci_memoization;
        return Stream.of(
                Arguments.of(first, -1L),
                Arguments.of(second, -2L),
                Arguments.of(third, -3L)
        );
    }
}
