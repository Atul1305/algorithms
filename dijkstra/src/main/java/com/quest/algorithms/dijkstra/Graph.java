package com.quest.algorithms.dijkstra;

import java.util.HashSet;
import java.util.Set;

public class Graph {
	
	private final Set<Node> nodes = new HashSet<>();
	
	public void addNode(Node node) {
		nodes.add(node);
	}

	public Set<Node> getNodes() {
		return nodes;
	}

}
