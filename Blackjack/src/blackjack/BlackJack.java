package blackjack;

public class BlackJack 
{
	public static void main(String[] args)
	{
		int num1 = 1; 
		int num2 = 14;
		
		if(num1 <= 0 || num2 <= 0)
		{
			System.out.println("Numbers must be greater than 0");
		}
		else
		{
			System.out.println(closestTo21(num1, num2));
		}
	}
	
	public static int closestTo21(int num1, int num2)
	{
		if(num1 > num2 && num1 <= 21)
		{
			return num1;
		}
		else if(num2 > num1 && num2 <= 21)
		{
			return num2;
		}
		else
		{
			return 0;
		}
	}
}

