package com.quest.algo.clonedirectedgraph.algorithms;

public class Graph {
	public Node root;

	public Graph(Node root) {
		this.root = root;
	}

	public Node clonedGraph() {
		Node clonedRootNode = new Node(root.value);
		traverse(root, clonedRootNode);
		return clonedRootNode;
	}

	public void traverse(Node node, Node clonedNode) {
		Node currentNode = node;

		for (Node adjacentNode : currentNode.adjacentNode) {
			if (!adjacentNode.visited) {
				adjacentNode.visited = true;
				Node newAdjacentNode = new Node(adjacentNode.value);
				clonedNode.adjacentNode.add(newAdjacentNode);
				traverse(adjacentNode, newAdjacentNode);
			}else {
				continue;
			}
		}
	}

}
