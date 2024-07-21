package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pro.sky.exceptions.DivisionByZeroException;
import pro.sky.service.CalculatorService;

public class CalculatorServiceTests {
    CalculatorService calculatorService = new CalculatorService();

    @Test
    @DisplayName("Проверка на сложение")
    void add_negative_with_negative() {
        int actual = calculatorService.add(-1, -1);
        Assertions.assertEquals(-2, actual);
    }
    
    @Test
    void add_positive_with_positive() {
        int actual = calculatorService.add(1, 1);
        Assertions.assertEquals(2, actual);
    }

    @Test
    @DisplayName("Проверка на умножение")
    void multiply_negative_with_negative() {
        int actual = calculatorService.multiply(-1, -1);
        Assertions.assertEquals(1, actual);
    }
    @Test
    void multiply_positive_with_negative() {
        int actual = calculatorService.multiply(1, -1);
        Assertions.assertEquals(-1, actual);
    }
    @Test
    @DisplayName("Проверка на вычитание")
    void substract_negative_with_negative() {
        int actual = calculatorService.substract(-13, -1);
        Assertions.assertEquals(-12, actual);
    }
    @Test
    void substract_positive_with_positive() {
        int actual = calculatorService.substract(10, 1);
        Assertions.assertEquals(9, actual);
    }
    @Test
    @DisplayName("Проверка на деление")
    void divide_negative_with_negative() {
        int actual = calculatorService.divide(-1, -1);
        Assertions.assertEquals(1, actual);
    }
    @Test
    void divide_positive_with_negative() {
        int actual = calculatorService.divide(10, -2);
        Assertions.assertEquals(-5, actual);
    }

    @Test
    @DisplayName("Проверка на исключение при делении на ноль")
    void exception_when_divide_by_zero() {
        Assertions.assertThrows(DivisionByZeroException.class, () -> {
            calculatorService.divide(1, 0);
        });
    }

}
