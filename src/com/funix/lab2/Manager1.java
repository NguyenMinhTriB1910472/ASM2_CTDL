package com.funix.lab2;

import java.io.IOException;

public class Manager1 {

	public static void main(String[] args) throws IOException {
		Stack<Product> stack=new Stack<Product>();
		OperationToProduct operationToProduct=new OperationToProduct();
		operationToProduct.w(
				"D:\\hoctap\\CyberSoft\\CTDL_LAB2\\data.txt", stack);
	}

}
