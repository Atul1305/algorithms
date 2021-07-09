package com.quest.algo.mirrorbinarytree;

public class MirrorBinaryTree {

	public Node root;

	public MirrorBinaryTree(Node root) {
		this.root = root;
	}
	
	public Node mirrorNode() {
		return mirrorNode(root);
		
	}
	
	private static Node mirrorNode(Node node){
		if(node == null) {
			return node;
		}
		
		Node left = mirrorNode(node.leftChild);
		Node right = mirrorNode(node.rightChild);
		
		node.leftChild = right;
		node.rightChild = left;
		
		return node;
		
	}
	
}