package com.funix.lab2;

public class Queue<T> {
	private Node<T> headNode;
	private Node<T> tailNode;
	
	public boolean isEmpty(){
		return (this.headNode ==null &&	this.tailNode ==null);
	}
	
	public boolean push(Product product) {
		Node newNode=new Node(product);
		if(isEmpty()) {
			headNode = tailNode = newNode;
			return true;
		}
		else {
			//ewNode.setPreviousNode(this.tailNode);
			tailNode.setNextNode(newNode);
			tailNode=newNode;
			return true;
		}
	}
	public Product pop() {
		
		
		if (isEmpty()) {
			return null;
		}
		Product value=headNode.getData();
		if(headNode==tailNode) {
			headNode=tailNode=null;
		}else {
			headNode=headNode.getNextNode();
		}
		
		return value;
		
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
