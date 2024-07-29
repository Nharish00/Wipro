package Assignment1;
import java.util.Scanner;

public class Problem1 {
	int x ;
	public Problem1(Scanner sc){
		x = sc.nextInt(); //taking the input from the user
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Problem1 obj1 = new Problem1(sc); 
		
		if(obj1.x % 2 != 0 && obj1.x >= 20 && obj1.x <= 30) {
			System.out.println("Tom");
		}
		
		
		if(obj1.x % 2 == 0 && obj1.x >= 20 && obj1.x <= 30) {
			System.out.println("Jerry");
	}	
}
}