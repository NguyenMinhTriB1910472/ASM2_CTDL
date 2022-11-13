package com.funix.lab2;

public class Node<T> {
	private Product data;
	private Node<T> nextNode;
	private Node<T> previousNode;
	public Node() {}
	public Node(Product data,Node<T> nextNode,Node<T> previousNode) {
		this.data=data;
		this.nextNode=nextNode;
		this.previousNode=previousNode;
	}
	public Node(Product data) {
		this.data=data;
	}
	public Product getData() {
		return this.data;
	}
	public void setData(Product data) {
		this.data = data;
	}
	public Node<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	public Node<T> getPreviousNode() {
		return previousNode;
	}
	public void setPreviousNode(Node<T> previousNode) {
		this.previousNode = previousNode;
	}
	public void print(Product product) {
		System.out.println(product.getId() +"|"+product.getPrice()+"|"+product.getQuanlity()+"|"+product.getTitle());
	}
}
