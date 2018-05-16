package com.java.TreeDataStructures;

public interface TreeI<T> {

	public  void preOrder(TNode node);

	public  void inOrder(TNode node);

	public void postOrder(TNode node);

	public  void levelOrder(TNode node);

	public  TNode delete(TNode node, Integer value);

	TNode insert(TNode node, Integer key);

	Boolean search(TNode node, Integer key);
	
	Integer height(TNode node);

	Boolean isEmpty(TNode node);

}
