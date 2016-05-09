/** 
	Demo_class demonstrates the Employee and ProductionWorker class objects
*/

class Demo_class
{
	public static void main(String[] args)
	{
	
		/**
			Create ProductionWorker class object and initialize with the values 
		*/
		
		ProductionWorker worker = new ProductionWorker("Joseph","897-J","May 3,2010",1,20.7);
		
		/**
			Printing the details of the given employee by calling the accessor methods
			using the above created worker object 
		*/
	
		System.out.println("Name of the employee: "+worker.get_emp_name());
		System.out.println("Identification number of the employee: "+worker.get_emp_id());
		System.out.println("Employee's hiring date: "+worker.get_hire_date());
		System.out.println("Employee's shift(1 indicates day shift and 2 indicates night shift: "+worker.get_shift());
		System.out.println("Employee's pay rate on hourly basis: "+worker.get_pay_rate());
	}
}
	
