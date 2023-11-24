package HW7.Controllet;

import HW7.Model.Calculator;

public class CalculatorDecorator implements CalculateInterface {
    protected Calculator calculator;

    public CalculatorDecorator(Calculator calculator) {
        this.calculator = calculator;
    }


    @Override
    public Calculator additionNumbers(Calculator numberNew) {
        Calculator result = calculator.additionNumbers(numberNew);
        System.out.println("Addition operation Log:" + calculator + " ->" + numberNew + " = "+ result);
        return result;
    }

    @Override
    public Calculator subtractNumbers(Calculator numberNew) {
        Calculator result = calculator.subtractNumbers(numberNew);
        System.out.println("Subtract operation Log:" + calculator + " ->" + numberNew + " = "+ result);
        return result;
    }

    @Override
    public Calculator multiplyNumbers(Calculator numberNew) {
        Calculator result = calculator.multiplyNumbers(numberNew);
        System.out.println("Multiply operation Log:" + calculator + " ->" + numberNew + " = "+ result);
        return result;
    }

    @Override
    public Calculator divideNumbers(Calculator numberNew) {
        Calculator result = calculator.divideNumbers(numberNew);
        System.out.println("Divide operation Log:" + calculator + " ->" + numberNew + " = "+ result);
        return result;
    }
    @Override
    public String toString() {
        return calculator.toString();
    }
}
