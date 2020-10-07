package kr.itedu.ex10.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		
		int n1 = 3;
		int n2 = 7;
		int result = n1 + n2;
		
		int sumResult = Calc.sum(n1, n2);
		
		Assert.assertEquals(sumResult, result);
		
		n1 = 7;
		n2 = 3;
		result = n1 + n2;
		
		sumResult = Calc.sum(n1, n2);
		
		Assert.assertEquals(sumResult, result);
		
		n1 = 5;
		n2 = 5;
		result = n1 + n2;
		
		sumResult = Calc.sum(n1, n2);
		
		Assert.assertEquals(sumResult, result);
	}

}
