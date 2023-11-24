package HW7.Controllet;

import HW7.Model.Calculator;
import HW7.View.CalculatorInput;

public class CalculatorController {
    private CalculatorInput calculatorInput;

    public CalculatorController(CalculatorInput calculatorInput) {
        this.calculatorInput = calculatorInput;
    }

    public void realizeCalculate() {

        double newRealOne = calculatorInput.getRealInput("FirstInput");
        double newImaginaryOne = calculatorInput.getImaginaryInput("FirstInput");

        double newRealTwo = calculatorInput.getRealInput("SecondInput");
        double newImaginaryTwo = calculatorInput.getImaginaryInput("SecondInput");

        Calculator numberFirst = new Calculator(newRealOne, newImaginaryOne);
        Calculator numberSecond = new Calculator(newRealTwo, newImaginaryTwo);

        CalculateInterface checkLogs = new CalculatorDecorator(numberFirst);

        int choice = CalculatorInput.getChoice();

        Calculator result;

        if (choice == 1) {
            result = checkLogs.additionNumbers(numberSecond);
            calculatorInput.displayResult(" The result of additionNumbers: " + numberFirst +
                    " and " + numberSecond + " = " + result);
        } else if (choice == 2) {
            result = checkLogs.subtractNumbers(numberSecond);
            calculatorInput.displayResult(" The result of subtractNumbers: " + numberFirst +
                    " minus " + numberSecond + " = " + result);
        } else if (choice == 3) {
            result = checkLogs.multiplyNumbers(numberSecond);
            calculatorInput.displayResult(" The product of multiplyNumbers: " + numberFirst +
                    " and " + numberSecond + " = " + result);
        } else if (choice == 4) {
            result = checkLogs.divideNumbers(numberSecond);
            calculatorInput.displayResult(" The result of divideNumbers: " + numberFirst +
                    " divided by " + numberSecond + " = " + result);
        } else {
            calculatorInput.displayResult(" Incorrect!Try Again! ");
        }
        calculatorInput.closeScanner();
    }
}
