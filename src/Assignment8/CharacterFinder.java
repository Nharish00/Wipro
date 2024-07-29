package Assignment8;

import java.util.Scanner;

public class CharacterFinder {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the string and followed by loaction number");
			String input = sc.nextLine().trim(); 
			String location = sc.next();
			System.out.println(characterLocator(input, location));
			sc.close();
			
		}
		
		public static char characterLocator(String input, String location) {
			 
			 char c = '\0'; 
			 
			 try {
				 int n = Integer.parseInt(location);
				 c = input.charAt(n);
			 }
			 catch(Exception e) {
				 if(e instanceof NumberFormatException) {
					 System.out.println("NumberFormatException");
				 }
				 else if(e instanceof StringIndexOutOfBoundsException) {
					 System.out.println("StringIndexOutOfBoundsException");
				 }
			 }
			return c;
		}
}
