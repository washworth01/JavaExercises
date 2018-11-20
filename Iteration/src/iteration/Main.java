package iteration;

public class Main 
{
	public static void main(String[] args)
	{
		boolean isadd = false;
		for (int i = 0; i < 10; i++)
		{
			System.out.println(addition(5, i, isadd));
		}
	}
	
	public static int addition(int num1, int num2, boolean add)
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
