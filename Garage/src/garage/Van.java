package garage;

public class Van extends Vehicle
{
	//Attributes
	private int capasity;
	private int numberOfCriminals;
	
	
	
	//Constructors
	public Van(String regNumber, String manufacturer,String make, String colour,
			int topSpeed, int capasity, int numberOfCriminals)
	{
		super(regNumber, manufacturer, make, colour, topSpeed);
		this.capasity = capasity;
		this.numberOfCriminals = numberOfCriminals;
	}
	
	public Van(String regNumber, String manufacturer, String make, int capasity
			, int numberOfCriminals)
	{
		this(regNumber, manufacturer, make, "Black", 0, 0, 0);
	}
	
	
	
	//Methods
}
