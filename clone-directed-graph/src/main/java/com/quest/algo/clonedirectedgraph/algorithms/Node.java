package com.quest.algo.clonedirectedgraph.algorithms;

import java.util.HashSet;
import java.util.Set;

public class Node {
	public final int value;
	public boolean visited;
	public final Set<Node> adjacentNode;
	
	public Node(int value) {
		super();
		this.value = value;
		this.visited = false;
		this.adjacentNode = new HashSet<>();
	}

}
