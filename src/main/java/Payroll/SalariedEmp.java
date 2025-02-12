package Payroll;

class SalariedEmp extends Employee
{
	public SalariedEmp(String name, float hourlyWage)
	{
		super(name,hourlyWage);
	}
	
	@Override // override the abstract function
	public float calcPay() 
	{
		return (float)(hourlyWage * 40); //assumes 40 hour work week
			
	}
}