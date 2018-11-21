package streamExercise;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class StreamExercise 
{
	public static void main(String[] args)
	{
		List<String>listOfStrings = new ArrayList<String>();		
		listOfStrings.add("Hello");
		listOfStrings.add("It's");
		listOfStrings.add("Dale");
		List<String> uppercase = capitalise(listOfStrings);
		System.out.println(uppercase);
		
		List<Integer> listOfNumbers = Arrays.asList(10,8,4,7,3,2,9,11);
		List<Integer> primeNumbers = returnPrimeNumbers(listOfNumbers);
		System.out.println(primeNumbers);
		
		Optional<String> concatenated = concatenate(listOfStrings);
		System.out.println(concatenated);
		Optional<Integer> sumOfEvens = sumOfEvenNumbers(listOfNumbers);
		System.out.println(sumOfEvens);
				
	}
	
	
	public static List<String> capitalise(List<String> listName)
	{
		List<String> capitalise = listName.stream()
				.map(string -> string.toUpperCase())
				.collect(Collectors.toList());
		
		return capitalise;	
	}
	
	public static Optional<String> concatenate(List<String> listName)
	{
		Optional<String> concatenate = listName.stream()
				.reduce((s1,s2) -> s1 + " " +s2);
		
		return concatenate;
	}
	
	public static List<Integer> returnPrimeNumbers(List<Integer> listName)
	{
		List<Integer> primeNumbers = listName.stream()
				.filter(number -> isPrime(number))
				.sorted()
				.collect(Collectors.toList());
		
		return primeNumbers;
	}
	
	public static Optional<Integer> sumOfEvenNumbers(List<Integer> listName)
	{
		Optional<Integer> evenNumbers = listName.stream()
				.filter(number -> isEven(number))
				.reduce(Integer::sum);
		
		return evenNumbers;
	}
	
	public static boolean isPrime(int number)
	{
		if(number % 2 != 0 && number > 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isEven(int number)
	{
		if(number % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
