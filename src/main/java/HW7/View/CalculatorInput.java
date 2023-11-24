package HW7.View;

import java.util.Scanner;

public class CalculatorInput {
    private static Scanner scanner = new Scanner(System.in);

    public double getRealInput(String number) {
        System.out.print("Put real number " + number + " complex number: ");
        return scanner.nextDouble();
    }

    public double getImaginaryInput(String number) {
        System.out.print("Put imaginary part of the " + number + " complex number: ");
        return scanner.nextDouble();
    }

    public void displayResult(String result) {
        System.out.println("The result is: " + result);
    }

    public void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }

    public static int getChoice() {
        System.out.print("Choose operation" + "\n" +
                "  1  -> for addition Numbers; " + "\n" +
                "  2  -> for subtraction Numbers; " + "\n" +
                "  3  -> for multiplication Numbers; " + "\n" +
                "  4  -> for division Numbers; " + "\n" + " Put number:  ");
        return scanner.nextInt();
    }
}
