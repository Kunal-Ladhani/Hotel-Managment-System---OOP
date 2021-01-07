import building.*
/*
	This class is a general representation of a room.
*/
public abstract class Room implements IRoom
{

	/*
		Length of the room
	 */
	protected int roomLength;
	/*
		Width of the room
	 */
	protected int roomWidth;
	/*
		Height of the room
	 */
	protected int roomHeight;

	/*
	 	A room has length, width, and height. Initializes all these fields of the class.
	 	roomLength - Length of the room.
	 	roomWidth  -  Width of the room.
		roomHeight - Height of the room.
	 */
	public Room(int roomLength, int roomWidth, int roomHeight) throws InvalidDimensionException
	{
		if(roomLength<=0 || roomWidth<=0 || roomHeight<=0)
		{
			throw new InvalidDimensionException(roomLength, roomWidth, roomHeight);
		}
		this.roomLength = roomLength;
		this.roomWidth = roomWidth;
		this.roomHeight = roomHeight;
	}

	/*
		Function Computes the volume of the room.

		Volume is computed as (roomLength * roomWidth * roomHeight).

		Function returns Volume of the room.
	 */
	protected int getVolume()
	{
		return (this.roomLength * this.roomWidth * this.roomHeight);
	}

	/*	
		Computes the surface area of the room.
		Surface Area is calculated as 2*(length * width + width * height + height * length).
		
		Function returns the Surface area of the room.
	*/
	protected int getSurfaceArea()
	{
		return (2 * this.roomHeight * (this.roomLength + this.roomWidth) + 2 * this.roomLength * this.roomWidth);
	}

	/*
		An abstract method that computes the room's bill.
		This method returns Bill for the room.
	*/
	public abstract int getBill();
}