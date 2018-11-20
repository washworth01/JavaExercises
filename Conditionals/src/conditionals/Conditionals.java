package conditionals;

public class Conditionals
{
	public static void main(String[] args)
	{
		boolean isadd = true;
		int number1 = 3;
		int number2 = 7;
		System.out.println(addOrMultiply(number1, number2, isadd));
	}
	
	public static int addOrMultiply(int num1, int num2, boolean add)
	{
		int sum;
			if (add == true)
			{
				sum = num1 + num2;
			}
			else
			{
				sum = num1 * num2;
			}
		return sum;
	}
}

