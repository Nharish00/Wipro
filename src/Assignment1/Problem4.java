package Assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
	 int num;
	 public Problem4(Scanner sc) {
		 num = sc.nextInt(); //Taking input from the user
	 }
	 public void check(){
		 
		 if(num < 9) {
			 System.out.println("It is  Unique Number");
			 return;
		 }
		int[] arr = new int[10];
		Arrays.fill(arr, 0);
		while(num > 0) {
			int rem = num % 10;
			arr[rem]++;
			num /= 10;
		}
		for(int i=0 ; i<arr.length; i++) {
			if(arr[i] > 1) {
				System.out.println("It is not a Unique Number");
				return;
			}
		}
		
		System.out.println("It is a unique Number");
		
	 }
	 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		 Problem4 obj1 = new Problem4(sc);
		 
		obj1.check();
		
		
	
	}
		
	
}
