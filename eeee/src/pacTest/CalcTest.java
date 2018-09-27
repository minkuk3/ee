package pacTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import pac.Calc;

class CalcTest {

	@Test
	void test() {
		assertEquals(3, Calc.sum(1, 2));
		assertEquals(5, Calc.sum(3, 2));
		assertEquals(6, Calc.sum(4, 2));
	}

}
