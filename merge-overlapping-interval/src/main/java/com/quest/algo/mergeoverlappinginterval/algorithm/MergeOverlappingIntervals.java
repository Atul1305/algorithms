package com.quest.algo.mergeoverlappinginterval.algorithm;

import java.util.Stack;

public class MergeOverlappingIntervals {

	public static Object[] merge(Tuple[] tuples) {
		Stack<Tuple> stack = new Stack<>();
		stack.add(tuples[0]);
		
		for (int i = 1; i < tuples.length; i++) {
			Tuple lastTuple = stack.peek();
			Tuple currentTuple = tuples[i];
			if(lastTuple.y >= currentTuple.x && lastTuple.y < currentTuple.y) {
				lastTuple.y = currentTuple.y;
			}else if(lastTuple.y > currentTuple.x && lastTuple.y > currentTuple.y){
				continue;
			}else {
				stack.add(currentTuple);
			}
		}
		
		return stack.toArray();
	}
	
	public static void print(Object[] tuples) {
		for (Object o : tuples) {
			Tuple t = (Tuple) o;
			System.out.println(t.x + "," + t.y);
		}
	}
}