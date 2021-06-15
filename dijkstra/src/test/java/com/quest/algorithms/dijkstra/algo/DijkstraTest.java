package com.quest.algorithms.dijkstra.algo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.quest.algorithms.dijkstra.Edge;
import com.quest.algorithms.dijkstra.Graph;
import com.quest.algorithms.dijkstra.Node;

public class DijkstraTest {

	@Test
	public void test() {
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D"); 
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");

		nodeA.addDestination(nodeB, new Edge(10));
		nodeA.addDestination(nodeC, new Edge(15));

		nodeB.addDestination(nodeD, new Edge(12));
		nodeB.addDestination(nodeF, new Edge(15));

		nodeC.addDestination(nodeE, new Edge(10));

		nodeD.addDestination(nodeE, new Edge(2));
		nodeD.addDestination(nodeF, new Edge(1));

		nodeF.addDestination(nodeE, new Edge(5));

		Graph graph = new Graph();
		graph.addNode(nodeA);
		
		graph = new Dijkstra().shortestDistance(graph, nodeA);
		
		assertTrue(nodeA.getDistance() == 0);
		assertTrue(nodeB.getDistance() == 10);
		assertTrue(nodeC.getDistance() == 15);
		assertTrue(nodeD.getDistance() == 22);
		assertTrue(nodeE.getDistance() == 24);
		assertTrue(nodeF.getDistance() == 23);

	}

}
