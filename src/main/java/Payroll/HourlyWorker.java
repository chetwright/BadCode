package Payroll;

class HourlyWorker extends Employee
{
	public HourlyWorker(String name, float hourlyWage)
	{
		super(name,hourlyWage);
	}
	
	@Override // override the abstract function
	public float calcPay() {
		if (hours <= 40) 
		{
			return hours * hourlyWage;
		}
		else
		{
			float standardPay = 40 * hourlyWage;
			float OT = (float) ((hours - 40.0) * (hourlyWage*1.5));
			return standardPay + OT;
		}
	}
}

