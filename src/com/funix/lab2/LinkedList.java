package com.funix.lab2;

import java.util.Scanner;

public class LinkedList<T> {
	Scanner scanner =new Scanner(System.in);
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

	 public Product createProduct() {
		 System.out.println("Mời nhập id: ");
		 String id=scanner.nextLine();
		 System.out.println("Mời nhập title: ");
		 String title=scanner.nextLine();
		 System.out.println("Mời nhập quantity: ");
		 int quantity=scanner.nextInt();
		 System.out.println("Mời nhập price: ");
		 double price=scanner.nextDouble();
		 Product product=new Product(id, title, quantity, price);
		 return product;
	 }
	 public void insertToTail(LinkedList<Product> list) {
		 Product product = createProduct();
		 list.insertAtTail(product);
	 }
	 public void Print(LinkedList<Product> linkedList) {
		 Node currentNode =linkedList.getHead();
		 while (currentNode!=null) {
			System.out.println(currentNode.getData().toString());
			currentNode=currentNode.getNextNode();
		}
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
	 public void deleteNodeByCode(Product key)
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
	 void deleteNode(int position)
	    {
	        // If linked list is empty
	        if (head == null)
	            return;
	 
	        // Store head node
	        Node temp = head;
	 
	        // If head needs to be removed
	        if (position == 0) {
	            head = temp.getNextNode(); // Change head
	            return;
	        }
	 
	        // Find previous node of the node to be deleted
	        for (int i = 0; temp != null && i < position - 1;
	             i++)
	            temp = temp.getNextNode();
	 
	        // If position is more than number of nodes
	        if (temp == null || temp.getNextNode() == null)
	            return;
	 
	        // Node temp->next is the node to be deleted
	        // Store pointer to the next of node to be deleted
	        Node next = temp.getNextNode().getNextNode();
	 
	        temp.setNextNode(next); // Unlink the deleted node from list
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
