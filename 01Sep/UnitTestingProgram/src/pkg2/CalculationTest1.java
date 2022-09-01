package pkg2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculationTest1 {

	@Test
	void test() {
		Calculation obj=new Calculation();
		assertEquals(11, obj.addition(5,6));
	}

}
