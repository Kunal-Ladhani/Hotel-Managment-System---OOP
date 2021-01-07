package building

public class HotelSuite
 {
	public WashRoom wRoom;
	public LivingRoom lRoom;
	public BedRoom[] br;
	public int totalCost;

	public HotelSuite(WashRoom w, LivingRoom l, BedRoom... br)
	{
		/*
			Contructor to initialize the washroom living room and bedrooms in the Hotel.
			There can be only 1 washroom, 1 living room in a hotel.
			But, there can me multiple bedrooms in the hotel so we use Varargs oveloading here.

			totalCost is initialized to 0.
		*/
		this.wRoom = w;
		this.lRoom = l;

		this.br = new BedRoom[br.length];
		for(int i=0;i<br.length;i++)
		 {
			this.br[i] = br[i];
		}
		this.totalCost = 0;
	}
	
	public int calculateCost()
	 {
	 	/*
			Method to calcualte the total cost of operation of the Hotel Suite.
			Total cost is calculated as sum of maintainance cost of washroom and living room,
			and all the bedrooms.
	 	*/
		this.totalCost = wRoom.maintenanceCost() + lRoom.maintenanceCost();

		for(int i=0;i<br.length;i++)
		{
			this.totalCost = this.totalCost + br[i].getBill() + br[i].maintenanceCost();
		}

		return this.totalCost;
	}
}
