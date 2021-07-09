package com.quest.algo.identicalbinarytrees.algorithms;

import java.util.List;

public class BinaryTree {
	
	public Node root;

	public BinaryTree(Node root) {
		this.root = root;
	}
	
	public static List<Integer> inorderTraversedList(Node node, final List<Integer> result){
		if(node == null) {
			return result;
		}
		
		inorderTraversedList(node.leftChild, result);
		result.add(node.value);
		inorderTraversedList(node.rightChild, result);
		
		return result;
	}
	
	public static boolean areTwoListSame(List<Integer> l1, List<Integer> l2){
		
		if(l1 == null || l2 == null|| l1.size() != l2.size())
			return false;
		
		int n = l1.size();
		for (int i = 0; i < n; i++) {
			if(!l1.get(i).equals(l2.get(i))) {
				return false;
			}
		}
		
		return true;
	}
	
	

}
