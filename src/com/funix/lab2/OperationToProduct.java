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
	 // e chưa biết sử lý node ở vị trí j như thế nào ạ!
	 public void sortByCode(LinkedList<Product> list) {
		 // e sử dụng bubble sort
		 // e không biết lấy getHead tại vị trí j làm sao
		 Node<Product> currentNode=list.getHead();
		 for (int i = 1; i < list.length(); ++i) {
				String key=list.getHead().getData().getId();
				int j=i-1;
				
				while(j>=0 && arr[j]>key) {
					arr[j+1]=arr[j];
					j=j-1;
				}
				arr[j+1]=key;
		 }
	 }
	 public void sortByCode(LinkedList<Product> list) {
		 // e sử dụng bubble sort
		 // e không biết lấy getHead tại vị trí j làm sao
		 Node<Product> currentNode=list.getHead();
		 int i=0;
		 while (i<list.length()) {
			 
			i++;
		}
	 }
	 public void addFirst(LinkedList<Product> list) {
		 Product product = new Product();
		 product.createProduct();
		 list.insertToHead(product);
	 }
}
