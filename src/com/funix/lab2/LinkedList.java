package com.funix.lab2;

public class LinkedList<T> {
	private T data;
	private Node head;
	private Node tail;
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public LinkedList() {}

	 public LinkedList(Node head, Node tail) {
		 this.head=head;
		 this.tail=tail;
	 }
	 public LinkedList(T data) {
		 this.data=data;
	 }

	 public boolean isEmpty() {
		 return this.head==null && this.tail==null;
	 }

	 public int length() {
		int count=0;
		if(isEmpty()) {
			return 0;
		}
		while (head!=null &&tail!=null) {
			count++;
			head=head.getNextNode();
		}
		return count;
	 }
	 

	 public void insertToHead(Product item) {
		 Node newNodeLinkedList=new Node(item);
		 newNodeLinkedList.setNextNode(this.head);
		 if(head==null) {
			 newNodeLinkedList.setPreviousNode(this.head);
		 }
		 head=newNodeLinkedList;
	 }


	 public void insertAfterPosition(int position, Product item) {
		 	Node newNode= new Node(item);
		 	Node lastNode=this.head;
		 	lastNode=this.head;
		 	lastNode.setNextNode(null);
		 	if (head==null) {
				lastNode.setPreviousNode(null);
				this.head=lastNode;
				return;
			}
		 	while (lastNode.getNextNode()!=null) {
				lastNode=lastNode.getNextNode();
			}
		 	lastNode.setNextNode(newNode);
		 	newNode.setPreviousNode(lastNode);
	 }


	 public void deleteTail() {
		Node lasNode=new Node();
		while (head.getNextNode()!=null) {
			 lasNode=head.getNextNode();
		}
		while (lasNode.getPreviousNode()==head) {
			head.getNextNode();
		}
		head.setNextNode(null);
	 }


	 public <T> void deleteElement(T item) {
		Node node=new Node();
		while (head.getNextNode().getData()==item) {
			node=head.getNextNode();
		}
		Node newNode=new Node();
		Node newNode2=node.getNextNode();
		newNode=node.getPreviousNode();
		newNode2.setPreviousNode(newNode);
		newNode.setNextNode(newNode.getNextNode().getNextNode());
	 }

	 public void swap(Node firstNode, Node secondNode) {
		 Node node =new Node();
		 node=firstNode;
		 firstNode=secondNode;
		 secondNode=node;
	 }

	 public void clear() {
		 this.head.setNextNode(null);
	 }
}
