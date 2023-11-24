package HW7.Controllet;

import HW7.Model.Calculator;

public interface CalculateInterface {
    Calculator additionNumbers(Calculator numberNew);

    Calculator subtractNumbers(Calculator numberNew);

    Calculator multiplyNumbers(Calculator numberNew);

    Calculator divideNumbers(Calculator numberNew);

    String toString();
}
