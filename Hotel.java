package building
/*
	primary class Hotel
*/
public class Hotel
{
	/*
		Hotel can have multiple hotel suites.
		total cost - variable to store total operation cost of hotel.
	*/
	public HotelSuite hotelroom[];
	public int totalCost;
	/*
		Constructor to assign hotel rooms
	*/
	public Hotel(HotelSuite... hotelroom)
	{
		this.hotelroom = new HotelSuite[hotelroom.length];
		for(int i=0;i<hotelroom.length;i++) {
			this.hotelroom[i] = hotelroom[i];
		}
	}
	/*
		Method to find total hotel operations cost.
	*/
	public int getHotelCost()
	{
		for(int i=0;i<hotelroom.length;i++)
		{
			this.totalCost = this.totalCost + this.hotelroom[i].calculateCost();
		}
		return this.totalCost;
	}
}
