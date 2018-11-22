package people;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class People 
{	
	int personAge;
	String personFullName;
	String personOccupation;
	
	public People(String fullName, String occupation, int age)
	{
		personFullName = fullName;
		personOccupation = occupation;
		personAge = age;
	}
	
	public String getName()
	{
		return personFullName;
	}
	
	public String getOccupation()
	{
		return personOccupation;
	}
	
	public void setAge(int age)
	{
		personAge = age;
	}
	
	public int getAge()
	{
		return personAge;
	}
	
	public static void main(String[] args)
	{
		ArrayList<People> person = new ArrayList<People>();
		
		//{new People("William Ashworth","Student"),new People("Richard Nixon", "POTUS"), new People("Harold Godwinson", "King")};
		person.add(new People("William Ashworth", "Student", 21));
		person.add(new People("Richard Nixon", "POTUS", 81));
		person.add(new People("Harold Godwinson", "King", 44));
		for (People i : person) 
		{
			personDetails(i.getName(), i.getOccupation(), i.getAge());
			List<String> listOfPersonsName = Arrays.asList(i.getName());
			//personDetails(searchByName(i.getName(), "Richard Nixon"), i.getOccupation(), i.getAge());
		}
		
		List<String> filtered = listOfPersonsName.stream()
				.filter(person -> checkName("William Ashwoth"))
				.collect(Collectors.toList());searchByName(String
						name)
		
	}
	
	public static void personDetails(String fullName, String occupation, int age)		
	{
		System.out.println("Name: " + fullName);
		System.out.println("Job Title: " + occupation);
		System.out.println("Age: " + age);
	}
	
	public static boolean checkName(String name)
	{
		if (name.contains(name))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

