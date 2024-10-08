package Assignment2;

import java.util.Scanner;

public class Calculator {
    private static Scanner scan;
    int firstValue;
    int secondValue;
    int operator;

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        new Calculator().getValues(scan);
    }

    // Get values and which operator from the menu
    public void getValues(Scanner scan) {
        char repeat;
        do {
            System.out.println("Enter the first number :");
            firstValue = scan.nextInt();
            System.out.println("Enter the second number :");
            secondValue = scan.nextInt();
            System.out.println("Enter the number beside the operation to perform : \n1. Add \n2. Subtract \n3. Multiply \n4. Divide");
            operator = scan.nextInt();
            String result = calculate(firstValue, secondValue, operator);
            System.out.println(result);
            System.out.println("Do you want to try again (y/n)?");
            repeat = scan.next().charAt(0);
        } while (repeat == 'y' || repeat == 'Y');
    }

    // Perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {
        int result = 0;
        String output = "";
        switch (operator) {
            case 1:
                result = firstValue + secondValue;
                output = firstValue + " + " + secondValue + " = " + result;
                break;
            case 2:
                result = firstValue - secondValue;
                output = firstValue + " - " + secondValue + " = " + result;
                break;
            case 3:
                result = firstValue * secondValue;
                output = firstValue + " * " + secondValue + " = " + result;
                break;
            case 4:
                if (secondValue != 0) {
                    result = firstValue / secondValue;
                    output = firstValue + " / " + secondValue + " = " + result;
                } else {
                    output = "The divider (second value) cannot be zero";
                }
                break;
            default:
                output = "Entered wrong option " + operator;
        }
        return output;
    }
}
