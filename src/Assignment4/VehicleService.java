package Assignment4;

public class VehicleService {
	 /*
	 create a Car object and return it
	 */
		public static void main(String[] args) {
			VehicleService vehicleService = new VehicleService();
			Car car1 =  vehicleService.createCar("Polo", "M1-P0", "Sports");
			Car car2 = vehicleService.createCar("Tata", "Punch", "Sedan");
			Bike bike1 = vehicleService.createBike("Ktm", "Duke 650 ", "Sports");
			Bike bike2 = vehicleService.createBike("TVS Apache", "RTR 310", "Crusier");
			
			System.out.println(car1.getManufacturerInformation());
			System.out.println(car1.getName() + " Max speed : " + car1.maxSpeed(car1.getType()));
			System.out.println(car2.getManufacturerInformation());
			System.out.println(car2.getName() + " Max speed : " + car2.maxSpeed(car1.getType()));
			System.out.println("Comparsion of max speed of car1 and car2 : " +vehicleService.compareMaxSpeed(car1, car1));
			
			
			System.out.println(bike1.getManufacturerInformation());
			System.out.println(bike1.getName() + " Max speed : " + bike1.maxSpeed(car1.getType()));
			System.out.println(bike2.getManufacturerInformation());
			System.out.println(bike2.getName() + " Max speed : " + bike2.maxSpeed(car1.getType()));
			System.out.println("Comparsion of speed of bike and bike2 : " + vehicleService.compareMaxSpeed(bike1, bike2));
			
			
			
			
			}
		 


	public Car createCar(String name, String modelName, String type) { 
			return  new Car(name, modelName, type);
	 } 
	 /*
	 create a bike object and return it
	 */
	 public Bike createBike(String name, String modelName, String type) {
		 	 
		 	return  new Bike(name, modelName, type);
	 }
	 /*
	 Method should compare the speed only if the vehicle is of "SPORTS"
	type.
	 Method should return 0 when speeds are equal otherwise should return
	maximum vehicle speed.
	 Method returns -1 if the type is not "SPORTS"
	 */
	 public int compareMaxSpeed(Vehicle first, Vehicle second) {
		if(first instanceof Car &&  second instanceof Car ) {
			Car c1 = (Car)first;
			Car c2 = (Car)second;
			if(c1.getType() == "Sports" && c2.getType() == "Sports") {
				if(c1.maxSpeed(c1.getType()) > c2.maxSpeed(c2.getType())) {
					return c1.maxSpeed(c1.getType());
				}
				else if(c1.maxSpeed(c1.getType()) < c2.maxSpeed(c2.getType())){
					return c2.maxSpeed(c2.getType());
				}
				else {
					return 0;
				}
			}
		}
		
		else if(first instanceof Bike && second instanceof Bike) {
			Bike b1 = (Bike)first;
			Bike b2 = (Bike)second;
			if(b1.getType() == "Sports" && b2.getType() == "Sports") {
				if(b1.maxSpeed(b1.getType()) > b2.maxSpeed(b2.getType())) {
					return b1.maxSpeed(b1.getType());
				}
				else if(b1.maxSpeed(b2.getType()) < b2.maxSpeed(b2.getType())){
					return b2.maxSpeed(b2.getType());
				}
				else {
					return 0;
				}
			} 
		}
		 
	 return -1;
	 }
}