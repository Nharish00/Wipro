package Assignment4;

public abstract class AbstractManufacturer {
	private String name, modelName, type;
	
	 public AbstractManufacturer(String name, String modelName, String type) {
	        this.name = name;
	        this.modelName = modelName;
	        this.type = type;
	    }
	public String getModelName() {
		 return modelName;
		 }
		 public String getType( ) {
		 return  type;
		 }
		 public String getName() {
		 return name;
		 }
		 
		 
		 public abstract String getManufacturerInformation();
}
