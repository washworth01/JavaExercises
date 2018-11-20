package uniqueSum;

public class UniqueSum 
{
	public static void main(String[] args) 
	{
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;	
		
		System.out.println(uniqueAddition(num1, num2, num3));
	}
	
	public static int uniqueAddition(int num1, int num2, int num3)
	{
		int sum;
		
		if(num1 == num2 && num1 == num3)
		{
			sum = 0;
		}
		else if(num1 == num2 || num1 == num3)
		{
			if(num1 == num2)
			{
				sum = num3;
			}
			else
			{
				sum = num2;
			}
		}
		else if(num2 == num1 || num1 == num3)
		{
			if(num2 == num1)
			{
				sum  = num3;
			}
			else
			{
				sum = num1;
			}
		}
		else
		{
			sum = num1 + num2 + num3;
		}
		
		return sum;
	}
}
