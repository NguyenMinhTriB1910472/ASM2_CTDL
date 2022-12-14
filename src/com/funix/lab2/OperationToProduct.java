package com.funix.lab2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
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
//	 }ư
	 public void print(LinkedList<Product> linkedList) {
		 Node currentLinkedList=linkedList.getHead();
		 while (currentLinkedList!=null) {
				System.out.println(currentLinkedList.getData().toString());
				currentLinkedList= currentLinkedList.getNextNode();
		 }
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
	 public void addLast(LinkedList<Product> list) {
		 OperationToProduct operationToProduct =new OperationToProduct();
		 Product product= operationToProduct.createProduct();
		 list.insertAtTail(product);
	 }
	 public void displayAll(LinkedList<Product> list) {
		 Product product= list.getHead().getData();
		 product.toString();
	 }
	 public void writeAllItemsToFile(String fileName, LinkedList<Product> list) throws IOException {
		 FileWriter cinFileWriter=null;
		 Node<Product> current = list.getHead();
		 try {
			 cinFileWriter = new FileWriter(fileName);
			 //System.out.println("Enter characters: ");
			 int i = 0;
	
			 while (current.getNextNode()!=null) {
				 cinFileWriter.write(current.getData().toString());
				 i++;
				 
			 }
		 } catch (Exception e) {
			 System.out.println("Ngoai le");
		 }

		 if (cinFileWriter != null) {
			 cinFileWriter.close();
		 }
	 }
	 public void getAllItemsFromFile(String fileName, LinkedList<Product> productLinkedList) throws NumberFormatException, IOException {
		 FileReader fileReader = new FileReader(fileName);
		 BufferedReader bufferedReader = new BufferedReader(fileReader);
		 String line;
		 while((line=bufferedReader .readLine())!=null) {
			String[] arr1= line.split("\\|");
		 	Product product= new Product(arr1[0].trim(), arr1[1].trim(),Integer.parseInt(arr1[2].trim()), Double.parseDouble(arr1[3].trim()));
		 	productLinkedList.insertAtTail(product);
		 };
		 System.out.print("Các phần tử trong mảng là : ");
		 fileReader.close();
		 bufferedReader.close();
	 }
	 public void getAllItemsFromFile(String fileName, Stack<Product> stack) throws IOException {
		 FileReader fileReader = new FileReader(fileName);
		 BufferedReader bufferedReader = new BufferedReader(fileReader);
		 String line;
		 while((line=bufferedReader .readLine())!=null) {
			String[] arr1= line.split("\\|");
		 	Product product= new Product(arr1[0].trim(), arr1[1].trim(),Integer.parseInt(arr1[2].trim()), Double.parseDouble(arr1[3].trim()));
		 	stack.push(product);
		 };
		 System.out.print("Các phần tử trong mảng là : ");
		 fileReader.close();
		 bufferedReader.close();

	}	 
	 public void getAllItemsFromFile(String fileName, Queue<Product> queue) throws NumberFormatException, IOException {
		 FileReader fileReader = new FileReader(fileName);
		 BufferedReader bufferedReader = new BufferedReader(fileReader);
		 String line;
		 while((line=bufferedReader .readLine())!=null) {
			String[] arr1= line.split("\\|");
		 	Product product= new Product(arr1[0].trim(), arr1[1].trim(),Integer.parseInt(arr1[2].trim()), Double.parseDouble(arr1[3].trim()));
		 	queue.push(product);
		 };
		 System.out.print("Các phần tử trong mảng là : ");
		 fileReader.close();
		 bufferedReader.close();
	 }
	 public Product searchByCode(LinkedList<Product> list) {
		 System.out.println("Mời bạn nhập giá trị cần tìm: ");
		 String idString= scanner.nextLine();
		 boolean finding= false;
		 Node node=list.getHead();
		 int count=0;
		 do {
			 Product product=node.getData();
				if (product.getId().equalsIgnoreCase(idString)) {
					node.print(product);
					finding=true;
					return product;
				}
				count++;
				node=node.getNextNode();
		} while (finding==false);
		 System.out.println("Can't find your product!");
		 return null;
	 }
//	 public void search(LinkedList<Product> list) {
//		 Product product=searchByCode(list);
//		 System.out.println();
//	 }
	 public void insertToTail(LinkedList<Product> list) {
		 Product product= createProduct();
		 list.insertAtTail(product);
		 print(list);
	 }
	 public void addFirst(LinkedList<Product> list) {
		 Product product = new Product();
		 product.createProduct();
//		 list.insertToHead(product);
	 }
	 public void deleteById(LinkedList<Product> list) {
		 Product product=searchByCode(list);
//		 product.createProduct();
		 list.deleteNodeByCode(product);
		 list.Print(list);
	 }
	 public void sort(LinkedList<Product> list) {
		for(Node node=list.getHead();node!=null;node=node.getNextNode()) {
			for(Node node1=node.getNextNode();node1!=null;node1=node1.getNextNode()) {
				if (node.getData().getId().equalsIgnoreCase(node1.getData().getId())) {
					Product temProduct=node.getData();
					node.setData(node1.getData());
					if (node1!=null) {
						node1=node1.getNextNode();
					}
				}
			}
		}
		print(list);
	}
	 public int binary(int binaryNumber) {
		 if (binaryNumber<=0) {
			return 0;
		}else {
			return 10 * binary(binaryNumber/2)+(binaryNumber%2);
		}
	 }
	 public void printBinary(Product product) {
		 int quantity=product.getQuanlity();
		 System.out.println("Biểu diễn số lượng sản phẩm sang nhị phân : ");
		 System.out.println(binary(quantity));
	 }
}
