package com.java.TreeDataStructures;

public class BinarySearchTree extends AbstractTree implements TreeI {

	TNode root;

	public void insert(Integer value) {

		root = insert(root, value);

	}

	public void postOrder() {
		postOrder(root);
		System.out.println();

	}

	public void preOrder() {

		preOrder(root);
		System.out.println();

	}

	public void inOrder() {
		inOrder(root);
		System.out.println();

	}

	public void levelOrder() {
		levelOrder(root);

	}

	public void height() {
		Integer height = height(root);
		System.out.println(height);
	}

	public Boolean isEmpty() {

		return isEmpty(root);

	}

	public Boolean search(Integer value) {

		return search(root, value);

	}

	public TNode delete(Integer key) {

		if (isEmpty())
			System.out.println("Tree Empty");
		else if (search(key) == false)
			System.out.println("Sorry " + key + " is not present");
		else {
			root = delete(root, key);
			System.out.println(key + " deleted from the tree");
		}

		return root;
	}

	private Integer minValue(TNode right) {
		Integer minv = root.value;
		while (root.left != null) {
			minv = root.left.value;
			root = root.left;
		}
		return minv;
	}

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(5);
		tree.insert(7);
		tree.insert(4);
		tree.insert(9);
		tree.insert(3);

		tree.postOrder();
		tree.inOrder();
		tree.preOrder();
		tree.levelOrder();
		tree.height();
		tree.isEmpty();

		tree.delete(5);
		tree.delete(10);

		tree.postOrder();
		tree.levelOrder();

	}

	@Override
	public TNode delete(TNode root, Integer key) {
		TNode p, p2, n;
		if (root.value == key) {
			TNode lt, rt;
			lt = root.getLeft();
			rt = root.getRight();
			if (lt == null && rt == null)
				return null;
			else if (lt == null) {
				p = rt;
				return p;
			} else if (rt == null) {
				p = lt;
				return p;
			} else {
				p2 = rt;
				p = rt;
				while (p.getLeft() != null)
					p = p.getLeft();
				p.setLeft(lt);
				return p2;
			}
		}
		if (key < root.value) {
			n = delete(root.getLeft(), key);
			root.setLeft(n);
		} else {
			n = delete(root.getRight(), key);
			root.setRight(n);
		}
		return root;
	}

	@Override
	public TNode insert(TNode node, Integer key) {
		if (root == null) {
			root = new TNode(key);
			return root;
		}

		TNode temp = root;

		while (temp != null) {

			if (key < temp.value) {
				if (temp.left == null) {
					temp.left = new TNode(key);
					break;
				} else
					temp = temp.left;

			} else {
				if (temp.right == null) {
					temp.right = new TNode(key);
					break;
				} else
					temp = temp.right;
			}

		}

		return root;

	}

	@Override
	public Boolean search(TNode node, Integer key) {

		if (node == null)
			return false;

		if (node.value == key)
			return true;

		if (key < node.value) {
			search(node.left, key);

		} else if (key > node.value) {
			search(node.right, key);

		}

		return false;
	}

}
