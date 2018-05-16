package com.java.TreeDataStructures;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public abstract class AbstractTree<T> implements TreeI<T> {

	@Override
	public void postOrder(TNode t) {

		if (t != null) {
			postOrder(t.left);
			postOrder(t.right);
			System.out.print(t.value);

		}

	}

	@Override
	public void inOrder(TNode t) {
		if (t != null) {
			postOrder(t.left);
			System.out.print(t.value);
			postOrder(t.right);

		}

	}

	@Override
	public void preOrder(TNode t) {

		if (t != null) {
			System.out.print(t.value);
			postOrder(t.left);
			postOrder(t.right);

		}
	}

	@Override
	public void levelOrder(TNode t) {

		ArrayDeque<TNode> q = new ArrayDeque<TNode>();
		q.add(t);

		while (!q.isEmpty()) {

			TNode child = q.poll();

			System.out.print(child.value + " ");

			if (child.left != null)
				q.add(child.left);

			if (child.right != null)
				q.add(child.right);

		}

	}

	@Override
	public Integer height(TNode node) {
		if (node == null)
			return -1;

		int hleft = height(node.left);
		int hright = height(node.right);
		Integer height = 1 + Math.max(hleft, hright);
		System.out.println();
		return height;
	}

	@Override
	public Boolean isEmpty(TNode node) {

		return node == null;

	}

	void topView(TNode root) {
		if (root != null) {
			printLeft(root.left);
			System.out.print(root.value + " ");
			printRight(root.right);

		}
	}

	void printLeft(TNode n) {
		if (n != null) {
			printLeft(n.left);
			System.out.print(n.value + " ");
		}
	}

	void printRight(TNode n) {
		if (n != null) {
			System.out.print(n.value + " ");
			printRight(n.right);
		}

	}
}
