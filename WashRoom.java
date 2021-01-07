import building.*
//This class simulates a washroom.

public class WashRoom extends Room implements IOperatingCost
{
	//To keep track of the waterbill of the washroom.
	private int waterBill;

	/*
		Initialize all fields of the class.
		Set waterBill as 0.
		roomLength Length of the washroom.
		roomWidth Width of the washroom.
		roomHeight Height of the washroom.
		throws InvalidDimensionException 
	*/
	public WashRoom(int roomLength, int roomWidth, int roomHeight) throws InvalidDimensionException
	{
		super(roomLength, roomWidth, roomHeight);
		this.waterBill = 0;
	}

	/*
		Returns the water bill for the washroom.
		The waterbill for the washroom.
	*/
	public int getBill()
	{
		return waterBill;
	}

	/*
		This method overrides the maintenance cost method of the IRoom interface.
	*/
	@Override
	public int maintenanceCost()
	{
		return 42;
	}

	/*
		In a bath room, you can use the plumbing fixtures "Shower", "Wash Basin". 
	 	Using these fixtures will lead to increase in the water bill.

	 	Usage for this method is:
	 	For "Shower" -
	 		increase the waterbill by 10
	 	For "Wash Basin" -
	 		increase the waterbill by 3. 
	 	No other plumbing fixtures can be used in the bath room.
	 
	 	name - Name of the plumbing fixtures.  
	 	throws InvalidUsageException 
	 */
	@Override
	public void use(String name) throws InvalidUsageException
	{
		try
		{
			if (name.equals("Shower"))
			{
				this.waterBill += 10;
			} 
			else if (name.equals("Wash Basin"))
			{
				this.waterBill += 3;
			}
			else if(name.equals(null))
			{
				throw new NullPointerException();
			}
			else
			{
				throw new InvalidUsageException("WashRoom", name);
			}
		}
		catch(NullPointerException e)
		{
			
		}
	}

}
