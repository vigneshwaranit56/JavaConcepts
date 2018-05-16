package com.java.TreeDataStructures;

public class BinaryTree extends AbstractTree implements TreeI {

	TNode root;

	private void insert(Integer key) {

		root = insert(root, key);

	}

	@Override
	public TNode insert(TNode node, Integer key) {

		if (node == null)
			return new TNode(key);
		else {

			if (node.right == null)
				node.right = insert(node.right, key);
			else
				node.left = insert(node.left, key);

		}

		return node;
	}

	private void search(Integer key) {

		search(root, key);

	}

	@Override
	public Boolean search(TNode node, Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	private void delete(Integer key) {

		delete(root, key);

	}

	@Override
	public  TNode delete(TNode node, Integer value) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
//
//		tree.insert(5);
//		tree.insert(7);
//		tree.insert(4);
//		tree.insert(9);
//		tree.insert(3);
//		tree.insert(2);
//
//		tree.insert(1);
		
		TNode node = new TNode(1);
		node.left=new TNode(2);
		node.left.left= new TNode(3);
		node.right = new TNode(4);
		
		node.right.right = new TNode(6);
		node.right.left = new TNode(5);
		node.right.left.right = new TNode(7);
		node.right.left.right.right =new TNode(8);
		node.right.left.right.right.right =new TNode(9);

		
		
		
		
		
		

		

		tree.topView(node);

	}

	private void isEmpty() {
		isEmpty(root);

	}
	
	private void topView(){
		topView(root);
	}

	private void height() {

		Integer height = height(root);
		System.out.println(height);
	}

	private void levelOrder() {

		levelOrder(root);
		System.out.println();
	}

	private void preOrder() {

		preOrder(root);
		System.out.println();
	}

	private void inOrder() {

		inOrder(root);
		System.out.println();
	}

	private void postOrder() {

		postOrder(root);
		System.out.println();
	}

}
