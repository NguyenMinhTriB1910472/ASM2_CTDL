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
	
	public void push(Product value) {
		Node newNode=new Node<>(value);
		newNode.setNextNode(topNode);
		topNode=newNode;
	}
	public Product pop() {
		Product product=topNode.getData();
		topNode=topNode.getNextNode();
		return product;
	}
	public void show(T value) {
		while (topNode.getNextNode()!=null) {
			System.out.println(topNode.getData().toString());
		}
	}
	
}
