import building.*
/*
	This class simulates a Living Room.
*/
public class LivingRoom extends Room implements IOperatingCost
{
	/*
		A boolean variable to keep track whether the TV is ON or OFF. True if ON.
	 */
	private boolean tvState;

	/*
		An bookshelf (array of integers) to keep the books in the living room.
	*/
	private int[] bookshelf;

	/*
		Stores the electricity bill for the livingroom.
	 */
	private int electricityBill;

	/*
		Initialize all fields of the class.

		Set electricityBill as 0.
		Set tvState as false.
		Create a bookshelf of size 10 which is initially empty.

		roomLength - Length of the livingroom.
		roomWidth  - Width of the livingroom.
		roomHeight - Height of the livingroom.
		throws InvalidDimensionException 
	*/
	public LivingRoom(int roomLength, int roomWidth, int roomHeight) throws InvalidDimensionException
	{
		super(roomLength, roomWidth, roomHeight);
		this.tvState = false;
		this.electricityBill = 0;
		this.bookshelf = new int[10];
	}

	/*
		Fetches the electricity bill amount.
		return Electricity bill for a Living Room.
	*/
	public int getBill()
	{
		return electricityBill;
	}

	/* 
		Fills the bookshelf with the provided books.
		 
		books - Books to be kept on the bookshelf.
		return true if filling was successful false otherwise.
	*/
	public boolean fillBookshelf(int[] books)
	{
		try
		{
			for (int i = 0; i < books.length; i++)
			{
				bookshelf[i] = books[i];
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
			return false;
		}
		return true;
	}

	/*
		getter method to fetc the tvState.
		
		returns tvState of the room.
	*/
	public boolean getTvState()
	{
		return tvState;
	}

	/*
		In a living room, you can use the appliance "TV".
		Use of the TV will lead to increase in the electricity bill.
		
		Usage for this method is:
	 
		If the TV is off, switch it on and increment electricity bill by 10.
	 	Otherwise, if the TV was already on, switch it off.

		No other appliances can be used in the living room.

 
		name - Name of the appliance.
		throws InvalidUsageException 
	 */
	@Override
	public void use(String name) throws InvalidUsageException
	{
		try
		{
			if (name.equals("TV"))
			{
				if (!this.tvState)
				{
					this.electricityBill += 10;
				}
				tvState = !tvState;
			}
			else if(name.equals(null))
			{
				throw new NullPointerException();
			}
			else
			{
				throw new InvalidUsageException("LivingRoom", name);
			}
		}
		catch(NullPointerException e)
		{
			
		}
	}
}
