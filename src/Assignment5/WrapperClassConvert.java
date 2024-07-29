package Assignment5;

import java.util.Scanner;

public class WrapperClassConvert {

    // Method to determine and convert given primitive type to its wrapper class and return result
    public Object convertToWrapper(Object input) {
       

        if (input instanceof Integer) {
            return (Integer) input;
        } else if (input instanceof Byte) {
            return (Byte) input;
        } else if (input instanceof Short) {
            return (Short) input;
        } else if (input instanceof Long) {
            return (Long) input;
        } else if (input instanceof Float) {
            return (Float) input;
        } else if (input instanceof Double) {
            return (Double) input;
        } else if (input instanceof Character) {
            return (Character) input;
        } else if (input instanceof Boolean) {
            return (Boolean) input;
        } else {
            return "Give proper primitive as input";
        }
    }

    public static void main(String[] args) {
        WrapperClassConvert converter = new WrapperClassConvert();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value:");
        String userInput = scanner.nextLine().trim(); // Read and trim input

        if (userInput.isEmpty()) {
            System.out.println("Give proper primitive as input");
        } else {
             try {
                if (userInput.matches("-?\\d+")) {
                    int input = Integer.parseInt(userInput);
                    System.out.println(converter.convertToWrapper(input));
                } else if (userInput.matches("-?\\d+L")) {
                    long input = Long.parseLong(userInput.substring(0, userInput.length() - 1));
                    System.out.println(converter.convertToWrapper(input));
                } else if (userInput.matches("-?\\d+\\.\\d+F")) {
                    float input = Float.parseFloat(userInput.substring(0, userInput.length() - 1));
                    System.out.println(converter.convertToWrapper(input));
                } else if (userInput.matches("-?\\d+\\.\\d+")) {
                    double input = Double.parseDouble(userInput);
                    System.out.println(converter.convertToWrapper(input));
                } else if (userInput.equalsIgnoreCase("true") || userInput.equalsIgnoreCase("false")) {
                    boolean input = Boolean.parseBoolean(userInput);
                    System.out.println(converter.convertToWrapper(input));
                } else if (userInput.length() == 1) {
                    char input = userInput.charAt(0);
                    System.out.println(converter.convertToWrapper(input));
                } else {
                    System.out.println("Give proper primitive as input");
                }
         } catch (NumberFormatException e) {
               System.out.println("Give proper primitive as input");
            }
        }

        scanner.close();
    }
 }
