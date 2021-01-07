import building.*
/*
	Exception Class to handle invalid cases and errors in the Hotel Managment Suite. 
*/
public class InvalidUsageException extends Exception
 {
	public InvalidUsageException(String roomType, String object)
	 {
		super(roomType+" cannot have "+object);
	}
}
