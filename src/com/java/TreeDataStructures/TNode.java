package com.java.TreeDataStructures;

public class TNode {
	
	public Integer value;
	public TNode left;
	public TNode right;
	
	
public TNode(Integer value) {
		
		this.value = value;
		left = null;
		right = null;
	}


	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public TNode getLeft() {
		return left;
	}

	public void setLeft(TNode left) {
		this.left = left;
	}

	public TNode getRight() {
		return right;
	}

	public void setRight(TNode right) {
		this.right = right;
	}

	


}
