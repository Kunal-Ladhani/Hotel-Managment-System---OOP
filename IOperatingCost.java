import building.*
/*
	Interface that abstracts the operating cost of different types of rooms.
*/
public interface IOperatingCost
{
	/*
		This method is an abstraction for operating various appliances / plumbing fixture.
		Depending on the use case, various operating costs may be updated.

		name -  Determines which appliance / plumbing fixture has to be used.
	 	throws InvalidUsageException 
	 */
	void use(String name) throws InvalidUsageException;
}
