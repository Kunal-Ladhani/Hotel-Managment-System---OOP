import building.*
/*
	An interface that defines common room properties
*/
public interface IRoom
{
	/*
		Compute cost of a building the room.
		returns 100 as default value
	*/
	default int maintenanceCost()
	{
		return 100;
	}
}