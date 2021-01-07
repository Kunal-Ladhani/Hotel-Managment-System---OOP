import building.*
/*
	This class simulates a bedroom.
 */
public class BedRoom extends Room implements IOperatingCost
{

	/*	
		Beds for the room.
	 */
	private Bed[] beds;

	/*
		To keep track whether the AC is on or not. True if AC is on else false.
	 */
	private boolean acState;

	/*
		To track whether the occupant is sleeping or not. True if occupant is asleep
		else false.
	 */
	private boolean sleepState;

	/*
		To keep track of the electricity bill for the bedroom.
	 */
	private int electricityBill;

	/*
		Initialize all fields of the class.
		Set electricityBill as 0.
	 	Set default values for sleepState and acState as false.
	 	Initialize e
			
		roomLength -	Length of the bedroom.
	 	roomWidth  -	Width of the bedroom.
		roomHeight -	Height of the bedroom.
	 	beds[]	   -	And array of beds in the bedroom.
	 	
	 	throws InvalidDimensionException 
	 */
	public BedRoom(int roomLength, int roomWidth, int roomHeight, Bed[] beds) throws InvalidDimensionException
	{
		super(roomLength, roomWidth, roomHeight);
		this.electricityBill = 0;
		this.sleepState = false;
		this.acState = false;
		this.beds = beds;
	}
	/*
		Return the sleep state of the bedroom
	 */
	public boolean getSleepState()
	{
		return sleepState;
	}

	/*
		Return the ac state of the bedroom
	*/
	public boolean getAcState()
	{
		return acState;
	}

	/*
		Returns the cost of the room given by the average cost of bed.
	 */
	@Override
	public int maintenanceCost()
	{
		try
		{
			int sum = 0;
			for(int i = 0; i < this.beds.length; i++)
			{
				sum += this.beds[i].getCost();
			}
			return sum / this.beds.length;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
			return 0;
		}
	}

	/*
		Returns the electricity bill for the room.
	 	The electricity bill.
	*/
	public int getBill()
	{
		return this.electricityBill;
	}
}