package AllMathFunction_testCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class All_Math_FunctionsTest {

	@Test
	void testAdd() {
		All_Math_Functions a1 = new All_Math_Functions();
		int actual = a1.add(5,5);
		int expected = 10;
		assertEquals(expected,actual,"Addition of test cases ");
	}

	@Test
	void testSub() {
		All_Math_Functions a1 = new All_Math_Functions();
		int actual = a1.sub(5,5);
		int expected = 0;
		assertEquals(expected,actual,"Substraction of test cases ");
	}

	@Test
	void testMul() {
		All_Math_Functions a1 = new All_Math_Functions();
		int actual = a1.mul(5,5);
		int expected = 25;
		assertEquals(expected,actual,"Multiplication of test cases ");
	}

	@Test
	void testDiv() {
		All_Math_Functions a1 = new All_Math_Functions();
		int actual = a1.div(5,5);
		int expected = 1;
		assertEquals(expected,actual,"Division of test cases ");
	}

}
