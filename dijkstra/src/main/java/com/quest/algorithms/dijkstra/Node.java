package com.quest.algorithms.dijkstra;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node {

	private final String name;
	private Integer distance = Integer.MAX_VALUE;
	private final List<Node> shortestpath = new LinkedList<>();
	private final Map<Node, Edge> adjacentNodes = new HashMap<>();
	
	public Node(String name) {
		this.name = name;
	}
	
	public void addDestination(Node destination, Edge distance) {
		adjacentNodes.put(destination, distance);
	}

	public String getName() {
		return name;
	}

	public List<Node> getShortestpath() {
		return shortestpath;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Map<Node, Edge> getAdjacentNodes() {
		return adjacentNodes;
	}
	
	@Override
	public String toString() {
		return "Node [name=" + name + ", shortestpath=" + shortestpath + ", distance=" + distance + ", adjacentNodes="
				+ adjacentNodes + "]";
	}
}
