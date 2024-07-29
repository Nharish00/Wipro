package Assignment1;
import java.util.Scanner;

public class Problem3 {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sum = 0 ;
		System.out.println("Enter the numbers to add and once your done enter '='  to get the sum of the numbers :" );
		
		while(sc.hasNext()) // Taking inputs from the user
		{   
			if(sc.hasNextInt()) {
				sum += sc.nextInt();
			}
			else {
				String input = sc.next();
				if(input.equals("=")) // Here we are asking to give '=' character from the user to understand that it was the end and print the sum;
				{  
					System.out.println(sum);
					break;
				}
				else {
					System.out.println("Error: Non-integer value encountered. Please enter integers only.");
				}
			}
		}
		 sc.close();
	}
}
