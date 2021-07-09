package com.quest.algo.addtwointegers.algorithms;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class AddtwoIntegersTest {

	@Test
	void test() {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(1);
		l1.add(0);
		l1.add(9);
		l1.add(9);
		
		LinkedList<Integer> l2 = new LinkedList<>();
		l2.add(7);
		l2.add(3);
		l2.add(2);
		
		LinkedList<Integer> l = AddtwoIntegers.addTwoNumbers(l1, l2);
		AddtwoIntegers.print(l);
	}

}
