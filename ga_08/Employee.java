public class Employee
{
	private String emp_name;   //emp_name variable stores the name of the employee
	private String emp_id;     //emp_id variable stores the identification number of the employee
	private String hire_date;  //hire_date stores the date on which the employee is hired

	
	/**
		Constructor 
		@param name employee name.
		@param id employee identification number.
		@param date employee's hiring date.
	*/

	
	public Employee(String name, String id, String date)
	{
		emp_name = name;
		emp_id = id;
		hire_date = date;
	}

	
	/**
		get_emp_name method
		@return employee's name
	*/


	public String get_emp_name()
	{
		return emp_name;
	}

	
	/**
		get_emp_id method
		@return employee's identification number
	*/

	
	public String get_emp_id()
	{
		return emp_id;
	}

	
	/**
		get_hire_date method
		@return employee's hiring date
	*/


	public String get_hire_date()
	{
		return hire_date;
	}	

}