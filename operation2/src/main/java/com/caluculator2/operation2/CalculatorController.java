// CalculatorController.java
package com.caluculator2.operation2;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public ResultResponse getAdditionResult(@RequestParam double a, @RequestParam double b) {
        double[] result = calculatorService.performOperation(a, b, "+");
        return new ResultResponse(result);
    }

    @GetMapping("/subtract")
    public ResultResponse getSubtractionResult(@RequestParam double a, @RequestParam double b) {
        double[] result = calculatorService.performOperation(a, b, "-");
        return new ResultResponse(result);
    }

    @GetMapping("/multiply")
    public ResultResponse getMultiplicationResult(@RequestParam double a, @RequestParam double b) {
        double[] result = calculatorService.performOperation(a, b, "*");
        return new ResultResponse(result);
    }

    @PostMapping("/calculate")
    public ResultResponse calculate(@RequestBody CalculatorRequest request) {
        double[] result = calculatorService.performOperation(request.getA(), request.getB(), request.getOperator());
        return new ResultResponse(result);
    }


}
