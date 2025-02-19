package Payroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	B H;
	D S;
	C C;
	B O;
	@BeforeEach
	void setUp() throws Exception 
	{
		H = new B("James",10);
		S = new D("Joyce",45);
		C = new C("Ulysses",39);
		O = new B("OTMaster",50);
	}

	@Test
	void testPayroll() 
	{
		H.s0000000(9);
		S.s0000000(6);
		C.s0000000(12);
		O.s0000000(50);
		assertEquals(H.c00(),90.0);
		assertEquals(S.c00(),1800);
		assertEquals(C.c00(),468);
		assertEquals(O.c00(),2750);
		
	}
	
}
