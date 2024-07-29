package Assignment1;
import java.util.Scanner;

public class Problem2 {
	  long input;
	
	public Problem2(Scanner sc) {
		input = sc.nextLong();
	}
	 
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("input : ");
		Problem2 obj = new Problem2(sc);
		 
		 
		long duplicate = obj.input;
		long reverse = 0;
		long evenNumbersSum  = 0;
		
		while(duplicate > 0) {
			long rem  =  duplicate % 10;
			reverse = (reverse * 10) +  rem;
			duplicate /= 10;
			if(rem % 2 == 0) {
				evenNumbersSum += rem;
			}
		}
		
		if(obj.input == reverse && evenNumbersSum > 25) {
			System.out.println("output : " + obj.input + "is palindrome and the sum of even numbers is greater than 25");
		}
		else if(obj.input == reverse && evenNumbersSum < 25) {
			System.out.println("output : " + obj.input + " is palindrome and sum of even numbers is less than 25");
		}
		else {
			System.out.println("output : " + obj.input + " is not palindrome");
		}
		
		
	}
}
