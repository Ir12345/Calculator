package core;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class CalculatorTest {
	@Test(enabled = true, groups = {"add","all"}, priority=0)
	public void test_add() {
		assertEquals(Calculator.add(2, 2), 4);
	}
	@Test(enabled = true, groups = {"sub","all"}, priority=1)
	public void test_subtract() {
		assertEquals(Calculator.subtract(4, 2), 2);
	}
	@Test(enabled = true, groups = {"multiply","all"}, priority=2)
	public void test_multiply() {
		assertEquals(Calculator.multiply(3, 3), 9);
	}
	@Test(enabled = true, groups = {"divide","all"}, priority=3)
	public void test_divide() {
		assertEquals(Calculator.divide(6, 3), 2);
	}
	@Test(enabled = true, expectedExceptions = ArithmeticException.class, groups = {"division","all"}, priority=4) 
	public void test_divide_by_0() {
		assertEquals(Calculator.divide(2, 0), 0);
	}
	@Test(enabled = true, groups = {"all"}, priority=4)
	public void test_object() {
		Calculator o = new Calculator();
	}
	
	
} 