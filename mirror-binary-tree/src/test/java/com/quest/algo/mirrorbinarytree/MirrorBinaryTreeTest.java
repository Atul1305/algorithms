package com.quest.algo.mirrorbinarytree;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MirrorBinaryTreeTest {

	@Test
	void test() {
		Node root = new Node(20);
		
		Node node1 = new Node(50);
		Node node2 = new Node(200);
		Node node3 = new Node(75);
		Node node4 = new Node(25);
		Node node5 = new Node(300);
		
		root.leftChild = node1;
		root.rightChild = node2;
		
		node1.leftChild = node3;
		node1.rightChild = node4;
		
		node2.rightChild = node5;
		
		Node result = new MirrorBinaryTree(root).mirrorNode();
		
		assertTrue(result.rightChild.leftChild.value == 25);
		assertTrue(result.rightChild.rightChild.value == 75);
		assertTrue(result.leftChild.leftChild.value == 300);

	}
}