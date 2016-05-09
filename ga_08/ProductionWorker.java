/**
	ProductionWorker class
*/


public class ProductionWorker extends Employee
{
	private int shift;            // shift variable stores the employee's type of shift i.e day or night
	private double pay_rate;      // pay_rate variable stores the pay rate of the employee on hourly basis

	
	/**
		constructor
		@param name employee name.
		@param id employee identification number.
		@param date employee's hiring date.
		@param sft employee's type of shift
		@param rate employee's hourly pay rate
	*/
	
	ProductionWorker(String name, String id, String date, int sft, double rate)
	{
		super(name,id,date);
		shift = sft;
		pay_rate = rate;
	}
	
	/**
		get_shift method
		@return shift employee's shift
	*/
		

	public int get_shift()
	{
		return shift;
	}

	/**
		get_pay_rate method
		@return pay_rate employee's hourly pay rate
	*/
	
	public double get_pay_rate()
	{
		return pay_rate;
	}
}