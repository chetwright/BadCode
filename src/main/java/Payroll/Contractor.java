package Payroll;

class Contractor extends Employee
{
	public Contractor(String name, float hourlyWage)
	{
		super(name,hourlyWage);
	}
	
	@Override // override the abstract function
	public float calcPay() 
	{
		return hours * hourlyWage;
			
	}
}