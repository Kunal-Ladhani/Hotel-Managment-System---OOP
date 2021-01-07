import building.*
/*
    A simple representation of a bed.
 */
public class Bed
{
    /*
        The material used to build the bed.
    */
    private String material;

    /*
        Overloaded constructors to initialize all fields of the class.

        material - Material of the bed.

        If material of the bed is given then, use it for initialization (paramatrized constructor).
        else, take "WOODEN" as the material of the bed (default constructor).
     */

    public Bed(String material)
    {
        this.material = material;
    }

    public Bed()
    {
        this.material = "WOODEN";
    }

    /*
        Cost of the bed depends upon the material used for building it.
            
        If the material is "WOODEN", then the cost is 200.
        Else the the cost is 300.
    
        Method returns the cost of building the bed.
    */
    public int getCost()
    {
        if (material.equals("WOODEN"))
            return 200;
        else 
            return 300;
    }

    /*
		nested class called king size bed
    */
    public class KingSizeBed
    {
    	private int additionalCost;
    	private int guests;
    	/*
			Overloaded Constructors

			one is default constructor with no parameter
			other is having two parameters -
				additional cost - additional cost per guest (dafault value 100)
				and guest - number of guests(default value 1)

    	*/
    	public KingSizeBed()
    	{
    		this.additionalCost = 100;
    		this.guests = 1;
    	}

		public KingSizeBed(int additionalCost, int guests)
    	{
    		this.additionalCost = additionalCost;
    		this.guests = guests;
    	}
    	/*
			Overloaded Methods with different parameters but same name
			Calculates cost of room 

			cost is the sum of additional cost for each guest.
    	*/
    	public int calculateCost(int additionalCost, int guests)
    	{
    		int cost = 0;

    		for(int counter=0; counter<guests; counter++)
    		{
    			cost+=additionalCost;
    		}

    		return cost;
    	}
    	/*
			This method also calculates the cost but takes only one parameter - guests
			guests - number of guests in the room

			this takes additional cost at the default value of 100.

    	*/
    	public int calculateCost(int guests)
    	{
    		int cost = 0;

    		for(int counter=0; counter<guests; counter++)
    		{
    			cost+=100;
    		}

    		return cost;
    	}    	
    }

    /*
		nested class called single bed
    */
    public class SingleBed
    {
    	private int additionalCost;
    	private int guests;
    	/*
			Overloaded Constructors

			one is default constructor with no parameter
			other is having two parameters -
				additional cost - additional cost per guest (dafault value 50)
				and guest - number of guests(default value 1)

    	*/
    	public SingleBed()
    	{
    		this.additionalCost = 50;
    		this.guests = 1;
    	}

		public SingleBed(int additionalCost, int guests)
    	{
    		this.additionalCost = additionalCost;
    		this.guests = guests;
    	}
    	/*
			Overloaded Methods with different parameters but same name
			Calculates cost of room 

			cost is the sum of additional cost for each guest.
    	*/
    	public int calculateCost(int additionalCost, int guests)
    	{
    		int cost = 0;

    		for(int counter=0; counter<guests; counter++)
    		{
    			cost+=additionalCost;
    		}

    		return cost;
    	}
    	/*
			This method also calculates the cost but takes only one parameter - guests
			guests - number of guests in the room

			this takes additional cost at the default value of 100.

    	*/
    	public int calculateCost(int guests)
    	{
    		int cost = 0;

    		for(int counter=0; counter<guests; counter++)
    		{
    			cost+=50;
    		}

    		return cost;
    	}
    }
}
