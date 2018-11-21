package tooHot;

public class TooHot {

	public static void main(String[] args) 
	{
		int temperature = 50;
		boolean isSummer = false;
		
		System.out.print(isItTooHot(temperature, isSummer));
	}
	
	public static boolean isItTooHot(int temperature, boolean isSummer)
	{
		boolean isTooHot;
		
		if (isSummer == false)
		{
			if (temperature >= 60 && temperature <= 90)
			{
				return isTooHot = true;
			}
		}
		else
		{
			if (temperature >=60 && temperature <= 100)
			{
				return isTooHot = true;
			}
		}
		
		return isTooHot = false;
	}
}
