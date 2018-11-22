package garage;

public class Car extends Vehicle
{
	//Attributes
	private boolean isConvertable;
	
	
	
	//Constructors
	public Car(String regNumber, String manufacturer, String make, String colour
			,int topSpeed, boolean isConvertable)
	{
		super(regNumber, manufacturer, make, colour, topSpeed);
		this.isConvertable = isConvertable;
	}
	
	public Car(String regNumber, String manufacturer, String make, boolean isConvertable)
	{	
		this(regNumber, manufacturer, make,"Black",0, false);
	}
	
	
	
	
	//Methods
}
