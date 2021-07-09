package com.quest.algo.mergeoverlappinginterval.algorithm;

import org.junit.jupiter.api.Test;

class MergeOverlappingIntervalsTest {

	@Test
	void test1() {
		Tuple[] tuples = new Tuple[4];
		tuples[0] = new Tuple(1, 5);
		tuples[1] = new Tuple(3, 7);
		tuples[2] = new Tuple(4, 6);
		tuples[3] = new Tuple(6, 8);
		
		
		Object[] result = MergeOverlappingIntervals.merge(tuples);
		MergeOverlappingIntervals.print(result);
	}
	
	@Test
	void test2() {
		Tuple[] tuples = new Tuple[2];
		tuples[0] = new Tuple(10, 12);
		tuples[1] = new Tuple(12, 15);
		
		
		
		Object[] result = MergeOverlappingIntervals.merge(tuples);
		MergeOverlappingIntervals.print(result);
	}
	
	@Test
	void test3() {
		Tuple[] tuples = new Tuple[2];
		tuples[0] = new Tuple(10, 12);
		tuples[1] = new Tuple(13, 15);
		
		
		
		Object[] result = MergeOverlappingIntervals.merge(tuples);
		MergeOverlappingIntervals.print(result);
	}

}
