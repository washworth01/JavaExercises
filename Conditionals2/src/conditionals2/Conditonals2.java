package conditionals2;

public class Conditonals2
{
	public static void main(String[] args)
	{
		boolean isadd = false;
		int number1 = 3;
		int number2 = 7;
		System.out.println(notZeroAddOrMultiply(number1, number2, isadd));

	}
	
	public static int notZeroAddOrMultiply(int num1, int num2, boolean add)
	{
		int sum;
		if (num1 == 0)
		{
			if(num2 == 0)
			{
				return 0;
			}
			else
			{
				return num2;
			}
		}
		else if (num2 == 0)
		{
			return num1;
		}
		else
		{
			if (add == true)
			{
				sum = num1 + num2;
			}
			else
			{
				sum = num1 * num2;
			}
		}
		return sum;
	}

}
