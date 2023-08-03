package com.caluculator2.operation2;
// CalculatorService.java
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double[] performOperation(double a, double b, String operator) {
        double[] result = new double[1];

        switch (operator) {
            case "+":
                result[0] = a + b;
                break;
            case "-":
                result[0] = a - b;
                break;
            case "*":
                result[0] = a * b;
                break;
            case "/":
                if (b != 0) {
                    result[0] = a / b;
                } else {
                    // Handle division by zero error.
                    result[0] = Double.NaN;
                }
                break;
            default:
                // Handle invalid operator error.
                result[0] = Double.NaN;
        }

        return result;
    }
}
