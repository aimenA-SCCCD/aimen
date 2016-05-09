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

	
	public Employee(String name, String id, String date) throws InvalidEmployeeNumber
	{
		emp_name = name;
		hire_date = date;

		if(!isEmployeeNumberValid(id))
			throw new InvalidEmployeeNumber(id);
		emp_id = id;

	}


	/** 
		isEmployeeNumberValid method checks if the given number follows 
	    	a specified pattern.
		@param number takes employee's number as string
		@return valid which gives true if valid and false if invalid
	*/

	public boolean isEmployeeNumberValid(String number)
	{
		boolean valid = false;
		
		char[] number_array; //To hold the characters in the number string

		number_array = number.toCharArray(); // converts the number string to the array of its characters
		
		if(number_array.length == 5)
		{
			if(Character.isDigit(number_array[0]) && Character.isDigit(number_array[1]) &&Character.isDigit(number_array[2]) && number_array[3] == '-' && Character.isLetter(number_array[4]) )
			valid = true;
		}
		
		return valid;
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