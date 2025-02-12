package Payroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	HourlyWorker H;
	SalariedEmp S;
	Contractor C;
	HourlyWorker O;
	@BeforeEach
	void setUp() throws Exception 
	{
		H = new HourlyWorker("James",10);
		S = new SalariedEmp("Joyce",45);
		C = new Contractor("Ulysses",39);
		O = new HourlyWorker("OTMaster",50);
	}

	@Test
	void testPayroll() 
	{
		H.setHours(9);
		S.setHours(6);
		C.setHours(12);
		O.setHours(50);
		assertEquals(H.calcPay(),90.0);
		assertEquals(S.calcPay(),1800);
		assertEquals(C.calcPay(),468);
		assertEquals(O.calcPay(),2750);
		
	}
	
}
