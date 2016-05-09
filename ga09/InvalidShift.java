/** 
	InvalidShift exceptions are thrown by the
	ProductionWorker class when an invalid shift is received.
*/

public class InvalidShift extends Exception
{
	/**
		This constructor specifies the shift provided is invalid
		@param shift
	*/

	public InvalidShift(int shift)
	{
		super("Error: Invalid shift: "+ shift + " The valid shift is either 1 or 2");
		
	}
}