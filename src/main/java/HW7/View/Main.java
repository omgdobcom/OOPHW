package HW7.View;

import HW7.Controllet.CalculatorController;

public class Main {
    public static void main(String[] args) {
        CalculatorInput calculatorInput = new CalculatorInput();
        CalculatorController calculatorController = new CalculatorController(calculatorInput);
        calculatorController.realizeCalculate();
    }
}
