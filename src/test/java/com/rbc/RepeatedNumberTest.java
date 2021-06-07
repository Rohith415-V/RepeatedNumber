package com.rbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RepeatedNumberTest {

	@Test
	void test1() {
		int result = new RepeatedNumber().whatsRepeated(new int[] {1,3,4,2,2});
		assertEquals(2,  result);
	}
	
	@Test
	void test2() {
		int result = new RepeatedNumber().whatsRepeated(new int[] {3,1,3,4,2});
		assertEquals(3,  result);
	}
	
	@Test
	void test3() {
		int result = new RepeatedNumber().whatsRepeated(new int[] {1,1});
		assertEquals(1,  result);
	}

}
