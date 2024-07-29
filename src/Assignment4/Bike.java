package Assignment4;

public class Bike extends AbstractManufacturer implements Vehicle {

	 public Bike(String name, String modelName, String bikeType) {
		 super(name,modelName,bikeType);
	 }
	 /*
	 Method returns maximum speed depending upon their types
	 For Sports-300kmh
	 For cruiser-170kmh
	 */
	 @Override
	 public int maxSpeed(String bikeType) {
		 if(bikeType == "Sports") {
			 return 300;
		 }
	 return 170;
	 }
	 /*
	 should return in the format : Bike{Manufacturer name:'name',Model
	Name:'modelName',Type:'type'}
	4
	 */
	 @Override
	 public String getManufacturerInformation() {
		 String bikeManufacturerInformation = "Manufacturer Name : " + this.getName() + "Model : " + this.getModelName() + "Type : " + this.getType();
	 return bikeManufacturerInformation;
	 }


}
