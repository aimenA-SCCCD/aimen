/** 
	Demo_class demonstrates the Employee and ProductionWorker class objects
*/

class Demo_class
{
	public static void main(String[] args) 
	{
	
		/**
			Create ProductionWorker class object for the first employee and initialize with the values 
		*/
		System.out.println("");
	
		System.out.println("The provided values for first employee  name, number, hiring date, shift and pay rate are Joseph, 897-J, May 3,2010, 1 and 20.7 respectively. ");
		System.out.println("");
 		System.out.println("");
		System.out.println("");
		

		try
		{	
			ProductionWorker employee1 = new ProductionWorker("Joseph","897-J","May 3,2010",1,20.7);

			System.out.println("The details of the first employee are printed as below:: ");
			System.out.println("");
			System.out.println("");

			/**
				Printing the details of the given employee by calling the accessor methods
				using the above created worker object 
			*/
	
			System.out.println("Name of the employee: "+ employee1.get_emp_name());
			System.out.println("Identification number of the employee: "+ employee1.get_emp_id());
			System.out.println("Employee's hiring date: "+ employee1.get_hire_date());
			System.out.println("Employee's shift(1 indicates day shift and 2 indicates night shift: "+ employee1.get_shift());
			System.out.println("Employee's pay rate on hourly basis: "+ employee1.get_pay_rate());
			System.out.println("");

		}
		catch(InvalidEmployeeNumber e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidShift e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidPayRate e)
		{
			System.out.println(e.getMessage());
		}
		
		

		

		/**
			Create ProductionWorker class object for the second employee and initialize with the values 
		*/
		

		System.out.println("The provided values for second employee  name, number, hiring date, shift and pay rate are Stephen, 2Y3-8, December 18,2008, 4 and -13.7 respectively. ");
		System.out.println("");
 		System.out.println("");
		System.out.println("");
		System.out.println("");

		try
		{
			ProductionWorker employee2 = new ProductionWorker("Stephen","2Y3-8","December 18,2008",7,-13.7);
		
			
			System.out.println("The details of the second employee are printed as below:: ");
			System.out.println("");
			System.out.println("");
		
			/**
				Printing the details of the given employee by calling the accessor methods
				using the above created worker object 
			*/

		
			System.out.println("Name of the employee: "+ employee2.get_emp_name());
			System.out.println("Identification number of the employee: "+ employee2.get_emp_id());
			System.out.println("Employee's hiring date: "+ employee2.get_hire_date());
			System.out.println("Employee's shift(1 indicates day shift and 2 indicates night shift: "+ employee2.get_shift());
			System.out.println("Employee's pay rate on hourly basis: "+ employee2.get_pay_rate());

		}
		catch(InvalidEmployeeNumber e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidShift e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidPayRate e)
		{
			System.out.println(e.getMessage());
		}

	
	}
}
	
