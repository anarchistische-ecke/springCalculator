package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.service.CalculatorService;

import java.util.stream.Stream;

public class CalculatorServiceParameterizedTests {
    CalculatorService calculatorService = new CalculatorService();
    
    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(18, 9),
                Arguments.of(15, 977),
                Arguments.of(-18, -9),
                Arguments.of(18, -9),
                Arguments.of(-18, 9),
                Arguments.of(198, 900)
        );
    }
    @ParameterizedTest
    @MethodSource("data")
    void add(int a, int b) {
        int actual = calculatorService.add(a, b);
        int expected = a + b;
        Assertions.assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("data")
    void substract(int a, int b) {
        int actual = calculatorService.substract(a, b);
        int expected = a - b;
        Assertions.assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("data")
    void multiply(int a, int b) {
        int actual = calculatorService.multiply(a, b);
        int expected = a * b;
        Assertions.assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("data")
    void divide(int a, int b) {
        int actual = calculatorService.divide(a, b);
        int expected = a / b;
        Assertions.assertEquals(actual, expected);
    }
}
