package com.funix.lab2;

public class Queue<T> {
	private Node<T> headNode;
	private Node<T> tailNode;
	public Node<T> getHeadNode() {
		return headNode;
	}
	public void setHeadNode(Node<T> headNode) {
		this.headNode = headNode;
	}
	public Node<T> getTailNode() {
		return tailNode;
	}
	public void setTailNode(Node<T> tailNode) {
		this.tailNode = tailNode;
	}
}
