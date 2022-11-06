package com.funix.lab2;

public class Queue<T> {
	private Node<T> headNode;
	private Node<T> tailNode;
	
	public boolean isEmpty(){
		return (this.headNode ==null &&	this.tailNode ==null);
	}
	
	public boolean push() {
		Node newNode=new Node<>();
		if(isEmpty()) {
			newNode=headNode=tailNode;
			return true;
		}
		else {
			newNode.setPreviousNode(this.tailNode);
			tailNode=newNode;
			return true;
		}
	}
	
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
