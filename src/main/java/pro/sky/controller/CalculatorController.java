package pro.sky.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.service.CalculatorService;

import static org.apache.coyote.http11.Constants.a;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/add")
    public String sum(@RequestParam int a, @RequestParam int b) {
        return a + " + " + b + " = " + calculatorService.add(a, b);
    }

    @GetMapping("/substract")
    public String substract(@RequestParam int a, @RequestParam int b) {
        return a + " - " + b + " = " + calculatorService.substract(a, b);

    }@GetMapping("/multiply")
    public String multirply(@RequestParam int a, @RequestParam int b) {
        return a + " * " + b + " = " + calculatorService.multiply(a,b);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int a, @RequestParam int b) {
        return a + " / " + b + " = " + calculatorService.divide(a, b);
    }

}
