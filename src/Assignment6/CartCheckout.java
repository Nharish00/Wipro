package Assignment6;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CartCheckout {
	 	public static String billGenerator(Map<String, BigDecimal> map, Double tax){
	 		if(map.isEmpty()) {
	 			return "The cart Map is empty";
	 		}
	 		if(tax < 0 || tax == null) {
	 			return tax < 0? "The taxPercent cannot be negative" : "The taxPercent cannot be null"; 
	 		}
	 		BigDecimal total = new  BigDecimal("0.0");
	 		for(Map.Entry<String, BigDecimal> e : map.entrySet()) {
	 			
	 			 total = total.add(e.getValue());	
	 		}
	 		BigDecimal finalAmount = total.multiply(new BigDecimal(tax));
	 		finalAmount = finalAmount.divide(new BigDecimal("100"));
	 		finalAmount = finalAmount.add(total);
	 		 
	 		
			return finalAmount.toString();
	 		
	 	}
	 	
	 	public static void main(String[] args) {
	 		Scanner sc = new Scanner(System.in);
	 		
			Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
			
			map.put("Apple", new BigDecimal("54"));
			map.put("Grapes", new BigDecimal("36.78"));
			map.put("Papaya", new BigDecimal("27.89"));
			map.put("Orange", new BigDecimal("23.6"));
			map.put("Banana", new BigDecimal("10.2"));
			
			Double tax = 10.5;
			
			System.out.println(billGenerator(map, tax));
			
			
		}
}
