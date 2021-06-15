package com.quest.algorithms.dijkstra.algo;

import java.util.Map;

import com.quest.algorithms.dijkstra.Edge;
import com.quest.algorithms.dijkstra.Graph;
import com.quest.algorithms.dijkstra.Node;

public final class Dijkstra {

	public Graph shortestDistance(Graph graph, Node source) {
		source.setDistance(0);
		getShortestPath(source);
		return graph;
	}

	/*
	 * The implementation of algorithm is dependent of DFS.
	 * 
	 */
	private void getShortestPath(Node currentNode) {
		if (currentNode != null) {
			for (Map.Entry<Node, Edge> entry : currentNode.getAdjacentNodes().entrySet()) {
				Node adjacentNode = entry.getKey();
				Edge edge = entry.getValue();
				if (edge.isTraversed()) {
					return;
				} else if (adjacentNode.getDistance() > currentNode.getDistance() + edge.getWeight()) {
					adjacentNode.setDistance(currentNode.getDistance() + edge.getWeight());
					adjacentNode.getShortestpath().add(currentNode);
				}
				entry.getValue().setTraversed(true);

				getShortestPath(adjacentNode);
			}
		} else {
			return;
		}
	}
}
