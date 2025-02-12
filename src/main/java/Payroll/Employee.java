package Payroll;
import java.util.List;
abstract class Employee 
{	
	String name;
	float hourlyWage;
	float hours;
	
	public Employee(String name, float hourlyWage) //constructor
	{
		super();
		this.name = name;
		this.hourlyWage = hourlyWage;
		this.hours = 0;
		
	}
	
	//getters and setters
	public void setHours(float hours) 
	{
		this.hours = hours;
	}
	public String getName() 
	{
		return name;
	}
	public abstract float calcPay(); // abstract class
	
	public float getHours()
	{
		return hours;
		
	}
	public static void setEmployeeHours(Employee employee, float hours)
	{
		employee.setHours(hours);
	}
	
	public static void payEmployees(List<Employee> employees) 
	{
		for (Employee employee : employees)
		{
			System.out.println(employee.getName() + " is to be payed " + employee.calcPay());
		
		}
	}
	public void main()
	{
		System.out.println("Hello, World!");
	}
}
