package com.quest.algo.mergesortedlinkedlist.algorithm;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class MergeSortedLinkedListTest {

	@Test
	void test() {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(1);
		l1.add(2);
		l1.add(5);
		l1.add(7);
		
		LinkedList<Integer> l2 = new LinkedList<>();
		l2.add(3);
		l2.add(4);
		l2.add(6);
		
		LinkedList<Integer> l = MergeSortedLinkedList.mergeSortedlinkedList(l1, l2);
		MergeSortedLinkedList.print(l);
		
	}

}
