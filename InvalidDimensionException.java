import building.*
/*
	Exception class for handling invalid cases in the hotel managment suite.
*/
public class InvalidDimensionException extends Exception
{
	
	private int length;
	private int width;
	private int height;
	
	public InvalidDimensionException(int length, int width, int height)
	{
		/*
			Constructor to initialize the length, width, and height of the room.
		*/
		this.length = length;
		this.width  = width;
		this.height = height;
	}
	
	
	public String getMessage()
	{
		/*
			Method to throw error message if the value of length, width or height is invalid (less than one).
			If all the three values are valid then return null.
		*/
		if(length<1)
			return "Length value is invalid.";
		else if(width<1)
			return "Width value is invalid.";
		else if(height<1)
			return "Height value is invalid.";

		return null;
	}
}
