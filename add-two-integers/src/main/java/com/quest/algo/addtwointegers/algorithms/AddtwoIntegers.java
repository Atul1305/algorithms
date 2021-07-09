package com.quest.algo.addtwointegers.algorithms;

import java.util.LinkedList;

public class AddtwoIntegers {

	public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2){
		LinkedList<Integer> result = new LinkedList<>();
		int n = l1.size() > l2.size() ? l1.size() : l2.size();
		int sum = 0;
		int num1 = 0;
		int num2 = 0;
		int carry = 0;
		
		for (int i = 0; i < n; i++) {
			num1 = 0;
			num2 = 0;
			
			if(i < l1.size())
				num1 = l1.get(i);
			if(i < l2.size())
				num2 = l2.get(i);
			
			sum = num1 + num2 + carry;
			
			carry = sum/10;
			sum = sum % 10;
			
			result.add(sum);
		}
		
		if(carry > 0)
			result.add(carry);
		
		return result;
	}
	
	public static void print(LinkedList<Integer> list) {
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}
}
