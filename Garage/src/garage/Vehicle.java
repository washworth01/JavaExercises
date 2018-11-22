package garage;

public abstract class Vehicle 
{
	//Attributes
	protected String manufacturer;
	protected String make;
	protected String regNumber;
	protected String colour;
	protected int topSpeed;	
	
	
	
	//Constructors
	public Vehicle(String regNumber, String manufacturer, String make)
	{
		this.regNumber = regNumber;
		this.manufacturer = manufacturer;
		this.make = make;
		this.colour = "Black";
		this.topSpeed = 0;
	}
	public Vehicle(String regNumber, String manufacturer, String make, String colour
			, int topSpeed)
	{
		this.regNumber = regNumber;
		this.manufacturer = manufacturer;
		this.make = make;
		this.colour = colour;
		this.topSpeed = topSpeed;
	}
	
	
	//Methods
	public String setColour(String colour)
	{
		this.colour = colour;
	}
	public int setTopSpeed(int topSpeed)
	{
		
	}
}
