package com.funix.lab2;

public class LinkedList<T> {
	
	// e có cần thêm node<T> vào không
	
	private Node head;
	private Node tail;

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

	

	 public boolean isEmpty() {
		 return head==null && tail==null;
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
	 public Product pop() {
		Product product=head.getData();
		if (isEmpty()) {
			return null;
		}
		else {
			head=head.getNextNode();
		}
		return product;
		
	 }
	 public void insertToTail(LinkedList<Product> list) {
		 Product product = null;
		 product.createProduct();
		 list.insertAtTail(product);
	 }
	 public void insertAtTail(Product item) {
		 	Node newNode= new Node(item);
		 	if(this.head==null) {
		 		this.head=this.tail=newNode;
		 		return;
		 	}
		 	this.tail.setNextNode(newNode);
		 	this.tail=newNode;
	 }
	 
	 public void deleteTail() {
		Node lasNode=new Node();
		Node lastNode=new Node();
		while (head.getNextNode()!=null) {
			 lasNode=head.getNextNode();
		}
		while (lasNode.getPreviousNode()==head) {
			head.getNextNode();
		}
		head.setNextNode(null);
	 }
	 void deleteNodeByCode(Product key)
	    {
	        // Store head node
	        Node temp = head, tail = null;
	  
	        // If head node itself holds the key to be deleted
	        if (temp != null && temp.getData().getId() == key.getId()) {
	            head = temp.getNextNode(); // Changed head
	            return;
	        }
	  
	        // Search for the key to be deleted, keep track of
	        // the previous node as we need to change temp.next
	        while (temp != null && temp.getData().getId() != key.getId()) {
	            tail = temp;
	            temp = temp.getNextNode();
	        }
	  
	        // If key was not present in linked list
	        if (temp == null)
	            return;
	  
	        // Unlink the node from linked list
	        tail.setNextNode(temp.getNextNode());;
	    }

	 public <T> void deleteElement(T item) {
		Node node=new Node();
		if (isEmpty()) {
			head=tail=null; 
		}
		
		while (head.getNextNode().getData()!=item) {
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
