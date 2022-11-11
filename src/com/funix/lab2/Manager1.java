package com.funix.lab2;

import java.io.IOException;
import java.util.List;

public class Manager1 {

	public static void main(String[] args) throws IOException {
		Queue<Product> proudctQueue= new Queue<Product>();
		OperationToProduct operationToProduct=new OperationToProduct();
		operationToProduct.getAllItemsFromFile(
				"D:\\hoctap\\CyberSoft\\CTDL_LAB2\\data.txt", proudctQueue);
//		LinkedList<Product> list = null;
//		Product product=new Product("1", "2", 0, 0);
//		list.insertAtTail(product);
//		while (list.getHead()!=null) {
//			list.getHead().toString();
//			list.getHead().getNextNode();
//		}
//		operationToProduct.writeAllItemsToFile("D:\\hoctap\\CyberSoft\\CTDL_LAB2\\data.txt", list);
		//tại s ở đây bị lập vô tận ta
		Node currentNode= proudctQueue.getHeadNode();
		while (currentNode.getNextNode()!=null) {
			System.out.println(proudctQueue.pop());
			//proudctQueue.getHeadNode().getNextNode();
		}
	}

}
