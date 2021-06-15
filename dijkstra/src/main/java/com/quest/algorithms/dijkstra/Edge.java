package com.quest.algorithms.dijkstra;

public class Edge {
	private final Integer weight;
	private boolean traversed;
	
	public Edge(Integer weight) {
		this.weight = weight;
	}

	public boolean isTraversed() {
		return traversed;
	}

	public void setTraversed(boolean traversed) {
		this.traversed = traversed;
	}

	public Integer getWeight() {
		return weight;
	}

}
