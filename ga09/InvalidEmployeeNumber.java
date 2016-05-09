/** 
	InvalidEmployeeNumber exceptions are thrown by the
	Employee class when the identification number of the 
	employee doesn't follow the pattern i.e XXX-L where 
	X is a number from 0 to 9 and L is an alphabet
*/

public class InvalidEmployeeNumber extends Exception
{
	/**
		This constructor specifies that the employee
		identification number is not following a
		specific pattern.
		@param identification number
	*/

	public InvalidEmployeeNumber(String id)
	{
		super("Error: Invalid identification number: "+ id );
	}
}