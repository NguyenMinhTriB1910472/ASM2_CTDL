package com.funix.lab2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OperationToProduct {
	Scanner scanner = new Scanner(System.in);
//	public int index(Product p, LinkedList<Product> list) {
//		int count=0;
//		if (list.isEmpty()) {
//			return 0;
//		}
//		while (list.) {
//			
//		}
//		return 0;
//	 }
	/**

	  * Creating and returning a product with info input from keyboard.

	  *

	  * @return The product

	  */

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
	 public void addLast(LinkedList<Product> list) {
		 OperationToProduct operationToProduct =new OperationToProduct();
		 Product product= operationToProduct.createProduct();
		 list.insertToHead(product);
	 }
	 public void displayAll(LinkedList<Product> list) {
		 Product product= list.getData();
		 product.toString();
	 }
	 public void writeAllItemsToFile(String fileName, LinkedList<Product> list) throws IOException {
		 FileWriter cinFileWriter=null;
		 try {
			 cinFileWriter = new FileWriter(fileName);
			 //System.out.println("Enter characters: ");
			 int i = 0;
	
			 while (i < list.length()) {
				 cinFileWriter.write(list.getData() + " ");
				 i++;
			 }
		 } catch (Exception e) {
			 System.out.println("Ngoai le");
		 }

		 if (cinFileWriter != null) {
			 cinFileWriter.close();
		 }
	 }
	 public void getAllItemsFromFile(String fileName, Stack<Product> stack) throws IOException {
		 FileReader fileReader = new FileReader(fileName);
		 BufferedReader bufferedReader = new BufferedReader(fileReader);
		 int i=0;
		 String arr=bufferedReader.readLine();
		 // chỗ này mình tách ra như thế nào! , vì không tách thành product để add vào mảng được
		 String[] arr1=arr.split("\\s");
		 while (i<arr1.length) {
			 Stack stack2=new Stack<>(arr1[i]);
			 i++;
		 }
		 System.out.print("Các phần tử trong mảng là : ");
		 fileReader.close();
		 bufferedReader.close();
		 
	 }
	 public void getAllItemsFromFile(String fileName, Queue<Product> queue) {

	 }
	 public void searchByCode(LinkedList<Product> list) {
		 System.out.println("Mời bạn nhập giá trị cần tìm: ");
		 String idString= scanner.nextLine();
		 boolean finding= false;
		 Node node=list.getHead();
		 int count=0;
		 do {
			 Product product=node.getData();
				if (product.getId().equalsIgnoreCase(idString)) {
					System.out.println(count);
					finding=true;
					break;
				}
				count++;
				node=node.getNextNode();
		} while (finding);
		 if(finding==false) {
			 System.out.println("Can't find your product!");
		 }
	 }
}
