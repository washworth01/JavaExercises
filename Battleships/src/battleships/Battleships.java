package battleships;

public class Battleships 
{
	static int[][] boardSpaces = new int[8][8];
	int placementX;
	int placementY;
	int shipSize;
	int shipAllignment;
	int shipPlacement;
	static Battleships ship[] = {new Battleships(),new Battleships(),new Battleships(),new Battleships(),new Battleships()};
	public Battleships()
	{

	}
	
	
	public void setPlacementX(int x)
	{
		shipPlacement = x;
	}
	public int getPlacementX()
	{
		return placementX;
	}
	
	public void setPlacementY(int y)
	{
		placementY = y;
	}
	public int getPlacementY()
	{
		return placementY;
	}
	
	public void setSize(int size)
	{
		shipSize = size;
	}
	public int getSize()
	{
		return shipSize;
	}
	
	public void setAllignment(int allignment)
	{
		shipAllignment = allignment;
	}
	public int getAllignment()
	{
		return shipAllignment;
	}
		
	public static void main(String[] args)
	{	
		//Battleships ship[] = {new Battleships(),new Battleships(),new Battleships(),new Battleships(),new Battleships()};
		ship[0].setSize(6);
		ship[0].setAllignment(0);
		ship[0].setPlacementX(1);
		ship[0].setPlacementY(1);
		ship[1].setSize(4);
		ship[1].setAllignment(1);
		ship[1].setPlacementX(1);
		ship[1].setPlacementY(1);
		ship[2].setSize(3);
		ship[2].setAllignment(2);
		ship[2].setPlacementX(1);
		ship[2].setPlacementY(1);
		ship[3].setSize(3);
		ship[3].setAllignment(1);
		ship[3].setPlacementX(1);
		ship[3].setPlacementY(1);
		ship[4].setSize(2);
		ship[4].setAllignment(0);
		ship[4].setPlacementX(1);
		ship[4].setPlacementY(1);
		
		for(int []x : boardSpaces)
		{
			for(int y : x)
			{
				System.out.print(y + "|");
			}
			
			System.out.println();
			System.out.println("-|-|-|-|-|-|-|-|");
		}	
	}
	public static void shipPlacement(int shipID)
	{
		if(ship[shipID].getAllignment() == 0) //h 
		{
			boardSpaces[ship[shipID].placementX()
		}
		else if(ship[shipID].getAllignment() == 1)//v
		{
			
		}
		else if(ship[shipID].getAllignment() == 2)//d
		{
			
		}
	}
}
