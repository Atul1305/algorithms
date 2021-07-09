package com.quest.algo.mergesortedlinkedlist.algorithm;

import java.util.LinkedList;

public class MergeSortedLinkedList {
	
	public static LinkedList<Integer> mergeSortedlinkedList(LinkedList<Integer> l1, LinkedList<Integer> l2){
		LinkedList<Integer> result = new LinkedList<>();
		
		int i=0;
		int j=0;
		
		while(i<l1.size() || j<l2.size()) {
			int num1 = i<l1.size() ? l1.get(i) : Integer.MAX_VALUE;
			int num2 = j<l2.size() ? l2.get(j) : Integer.MAX_VALUE;
			
			if(num1 < num2) {
				result.add(num1);
				i++;
			}else {
				result.add(num2);
				j++;
			}
		}
		
		return result;
	}

	public static void print(LinkedList<Integer> list) {
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

}
