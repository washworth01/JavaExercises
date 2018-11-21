package iterationArrays2;

public class Main 
{
	public static void main(String[] args)
	{
		int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		boolean isadd = false;
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(addOrMultiply(5, arrayOfNumbers[i], isadd));
			arrayOfNumbers[i] = arrayOfNumbers[i]*10;
		}
		for(int i = 0; i < 10; i++)
		{
			System.out.println(addOrMultiply(5, arrayOfNumbers[i], isadd));
		}
	}
	
	public static int addOrMultiply(int num1, int num2, boolean add)
	{
		int sum;
		if (num1 == 0)
		{
			return num2;
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
