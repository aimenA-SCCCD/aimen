/** 
	InvalidPayRate exceptions are thrown by the
	ProductionWorker class when the hourly pay rate received is negative.
*/

public class InvalidPayRate extends Exception
{
	/**
		This constructor specifies that the hourly pay rate value is negative.
		@param rate is the hourly pay rate of the employee
	*/

	public InvalidPayRate(double rate)
	{
		super("Error: Invalid pay rate: "+ rate );
	}
}