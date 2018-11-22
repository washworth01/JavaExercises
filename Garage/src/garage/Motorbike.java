package garage;

public class Motorbike extends Vehicle
{
	//Attributes
	private int sprocketTeeth;
	
		
		
		
	//Constructors
	public Motorbike(String regNumber, String manufacturer, String make, String colour
			, int topSpeed, int sprocketTeeth)
	{
		super(regNumber, manufacturer, make, colour, topSpeed);
		this.sprocketTeeth = sprocketTeeth;
	}
	public Motorbike(String regNumber, String manufacturer, String make
			, int sprocketTeeth)
	{
		this(regNumber, manufacturer, make, "Black", 0, 0);
	}
	
	
	
	//Methods
	
}
