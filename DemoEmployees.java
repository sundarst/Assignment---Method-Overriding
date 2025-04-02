class  Employee
{
	    String name;
		String EmployeeId;
		int salary;
	
	public void getEmployeeDetails(String name,String EmployeeId, int salary)
	{
		this.name=name;
		this.EmployeeId=EmployeeId;
		System.out.println(name+EmployeeId);

	}

}
class HourlyEmployee  extends Employee
{
	int hourlySalary;
	
	public void getEmployeeDetails( String name,String EmployeeId,int hourlySalary )
	{
		
		this.name=name;
		this.EmployeeId=EmployeeId;
		this.hourlySalary=hourlySalary;
		System.out.println("Name: "+name+ " EmployeeId: "+EmployeeId+ " HourlySalary:"+hourlySalary);
		
		
	}
	
}
class SalariedEmployee extends Employee
{
	int salaryEmployee;
	String place ;
	
	public void getEmployeeDetails( String name,String EmployeeId,int  salaryEmployee)
	{
	this.name=name;
	this.EmployeeId=EmployeeId;
	this.salaryEmployee=salaryEmployee;
	
	System.out.println("Name: "+name+ " Employee Id: "+EmployeeId+ " SalaryEmployee:"+salaryEmployee);
		
	}
}

public class DemoEmployees
{
	public static void main(String[] args)
	{
		Employee employee=new  HourlyEmployee();
		employee.getEmployeeDetails("Sundar","007",300);
		Employee employee2=new SalariedEmployee();
		employee2.getEmployeeDetails("Kutty","009",100000);
	}
}