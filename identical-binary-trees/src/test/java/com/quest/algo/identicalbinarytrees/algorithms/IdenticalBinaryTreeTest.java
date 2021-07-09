package com.quest.algo.identicalbinarytrees.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class IdenticalBinaryTreeTest {

	@Test
	void test_PostiveCase() {
		// Binary Tree 1
		Node root1 = new Node(100);
		
		Node node1 = new Node(50);
		Node node2 = new Node(200);
		Node node3 = new Node(25);
		Node node4 = new Node(125);
		Node node5 = new Node(350);
		
		root1.leftChild = node1;
		root1.rightChild = node2;
		
		node1.leftChild = node3;
		
		node2.leftChild = node4;
		node2.rightChild = node5;
		
		// Binary Tree 2
		Node root2 = new Node(100);
		
		Node node2_1 = new Node(50);
		Node node2_2 = new Node(200);
		Node node2_3 = new Node(25);
		Node node2_4 = new Node(125);
		Node node2_5 = new Node(350);
		
		root2.leftChild = node2_1;
		root2.rightChild = node2_2;
		
		node2_1.leftChild = node2_3;
		
		node2_2.leftChild = node2_4;
		node2_2.rightChild = node2_5;
		
		List<Integer> result1 = BinaryTree.inorderTraversedList(root1, new ArrayList<>());
		List<Integer> result2 = BinaryTree.inorderTraversedList(root2, new ArrayList<>());
		
		assertTrue(BinaryTree.areTwoListSame(result1, result2));
		
	}
	
	@Test
	void test_Negative() {
		// Binary Tree 1
		Node root1 = new Node(100);
		
		Node node1 = new Node(50);
		Node node2 = new Node(89);
		Node node3 = new Node(25);
		Node node4 = new Node(125);
		Node node5 = new Node(350);
		
		root1.leftChild = node1;
		root1.rightChild = node2;
		
		node1.leftChild = node3;
		
		node2.leftChild = node4;
		node2.rightChild = node5;
		
		// Binary Tree 2
		Node root2 = new Node(100);
		
		Node node2_1 = new Node(50);
		Node node2_2 = new Node(200);
		Node node2_3 = new Node(25);
		Node node2_4 = new Node(125);
		Node node2_5 = new Node(350);
		
		root2.leftChild = node2_1;
		root2.rightChild = node2_2;
		
		node2_1.leftChild = node2_3;
		
		node2_2.leftChild = node2_4;
		node2_2.rightChild = node2_5;
		
		List<Integer> result1 = BinaryTree.inorderTraversedList(root1, new ArrayList<>());
		List<Integer> result2 = BinaryTree.inorderTraversedList(root2, new ArrayList<>());
		
		assertFalse(BinaryTree.areTwoListSame(result1, result2));
		
	}
}
