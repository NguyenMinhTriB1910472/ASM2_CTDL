package com.funix.lab2;

import java.io.IOException;
import java.util.List;

public class Manager1 {

	public static void main(String[] args) throws IOException {
		Stack<Product> stack=new Stack<Product>();
		OperationToProduct operationToProduct=new OperationToProduct();
		operationToProduct.getAllItemsFromFile(
				"D:\\hoctap\\CyberSoft\\CTDL_LAB2\\data.txt", stack);
//		LinkedList<Product> list = null;
//		Product product=new Product("1", "2", 0, 0);
//		list.insertToHead(product);
//		operationToProduct.writeAllItemsToFile("D:\\hoctap\\CyberSoft\\CTDL_LAB2\\data.txt", list);
		while (stack.getTopNode()!=null) {
			System.out.println(stack.getTopNode().getData().toString());
			stack.getTopNode();
		}
	}

}
