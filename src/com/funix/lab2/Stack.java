package com.funix.lab2;

public class Stack<T> {
	private T value;
	private Node topNode ;
	public Stack() {
		this.topNode=null;
	}
	public Stack(T value) {
		this.topNode=null;
		this.value=value;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getTopNode() {
		return topNode;
	}
	public void setTopNode(Node<T> topNode) {
		this.topNode = topNode;
	}
	
	public void push(T value) {
		Node newNode=new Node<>();
		newNode.setNextNode(topNode);
		topNode=newNode;
	}
	
}
