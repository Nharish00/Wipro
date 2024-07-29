package Assignment3;
import java.util.Scanner;

public class RearrangeArrayElements {

    public static void main(String[] args) {
        new RearrangeArrayElements().inputAcceptor();
    }

    // Method to accept inputs from the user and validate
    public void inputAcceptor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        if (!inputArraySizeValidator(size)) {
            displayResult(null);
            return;
        }

        int[] inputArray = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        if (!inputArrayValidator(inputArray)) {
            displayResult(null);
            return;
        }

        int[] rearrangedArray = computeRearrangedArray(inputArray);
        displayResult(rearrangedArray);
    }

    // Method to validate the given array size
    public boolean inputArraySizeValidator(int size) {
        return size > 0;
    }

    // Method to validate if the given array is sorted
    public boolean inputArrayValidator(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > input[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Method to rearrange elements of the array
    public int[] computeRearrangedArray(int[] inputArray) {
        int n = inputArray.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag) {
                result[i] = inputArray[right--];
            } else {
                result[i] = inputArray[left++];
            }
            flag = !flag;
        }
        return result;
    }

    // Method to print the result
    public void displayResult(int[] outputArray) {
        if (outputArray == null) {
            System.out.println("Give proper input");
        } else {
            for (int i : outputArray) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
