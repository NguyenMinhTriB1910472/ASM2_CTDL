package com.funix.lab2;

import java.io.IOException;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.asm1.main.Utils;

public class Manager1 implements Comparator<Product>{
	static Scanner scanner = new Scanner(System.in);
	static Queue<Product> productQueue=new Queue<Product>();
	static OperationToProduct operationToProduct=new OperationToProduct();
	static LinkedList<Product> linkedList=new LinkedList<Product>();

	public static void main(String[] args) throws IOException {
//		Queue<Product> proudctQueue= new Queue<Product>();
//		operationToProduct.getAllItemsFromFile(
//				"D:\\hoctap\\CyberSoft\\CTDL_LAB2\\data.txt", linkedList);
//		LinkedList<Product> list = null;
//		Product product=new Product("1", "2", 0, 0);
//		list.insertAtTail(product);
//		while (list.getHead()!=null) {
//			list.getHead().toString();
//			list.getHead().getNextNode();
//		}
//		operationToProduct.writeAllItemsToFile("D:\\hoctap\\CyberSoft\\CTDL_LAB2\\data.txt", list);
		//Node currentNode= proudctQueue.getHeadNode();
		
		operationToProduct.getAllItemsFromFile("D:\\hoctap\\CyberSoft\\CTDL_LAB2\\data.txt", linkedList);
//		operationToProduct.insertToTail(linkedList);
//		while (!linkedList.isEmpty()) {
//			System.out.println(linkedList.pop());
//			//proudctQueue.getHeadNode().getNextNode();
//		}
//		operationToProduct.writeAllItemsToFile("D:\\\\hoctap\\\\CyberSoft\\\\CTDL_LAB2\\\\data.txt", linkedList);
//		while (!linkedList.isEmpty()) {
//			System.out.println(linkedList.pop());
//			//proudctQueue.getHeadNode().getNextNode();
//		}
//		operationToProduct.insertToTail(linkedList);
		operationToProduct.searchByCode(linkedList);
    	operationToProduct.print(linkedList);
	}
	
	public static void choice() throws IOException {
		  int choice = 0;
		  do {
		    welcome();
		    choice = Utils.getAnInteger();
		    while (choice <= 0 || choice >=10) {
		      System.out.print("Nhap loi! (yeu cau nhap lai) : ");
		      choice = Utils.getAnInteger();
		    }
		    
	 		
		    switch (choice) {
		      case 1:
		    	operationToProduct.getAllItemsFromFile("D:\\hoctap\\CyberSoft\\CTDL_LAB2\\data.txt", linkedList);
		    	while (!linkedList.isEmpty()) {
					System.out.println(linkedList.getHead().getData().toString());
				}
		    	
		        break;
		      case 2:
		    	Product product= operationToProduct.createProduct();
		    	linkedList.insertAtTail(product);
		        break;
		      case 3:
		    	operationToProduct.print(linkedList);
		        break;
		      case 4:
		    	// khong write dc
		  		operationToProduct.writeAllItemsToFile("D:\\\\hoctap\\\\CyberSoft\\\\CTDL_LAB2\\\\data.txt", linkedList);
		        break;
		      case 5:
		    	//search ket qua ra sai 
		    	operationToProduct.searchByCode(linkedList);
		    	operationToProduct.print(linkedList);
		        break;
		      case 6:
		    	//delete không được
		    	operationToProduct.deleteById(linkedList);
		  		while (!linkedList.isEmpty()) {
		  			System.out.println(linkedList.pop());
		  		}
			    break;
		      case 7:
		    	  System.out.println("Mời nhập giá trị cần tìm giá trị lớn hơn : ");
			    	 Collections.sort(null);
		    	
				break;
			  case 0:
				  System.out.println("Exit");
				  System.exit(0);
		      default:
		        break;
		      }
		    }while(choice !=12);
	}
	public static void welcome() {
	    // menu khi start
	 	System.out.println("System.out.println(\"Choose one of this options:\");\r\n"
	 			+ "\r\n"
	 			+ "   System.out.println(\"Product list:\");\r\n"
	 			+ "\r\n"
	 			+ "   System.out.println(\"1. Load data from file and display\");\r\n"
	 			+ "\r\n"
	 			+ "   System.out.println(\"2. Input & add to the end.\");\r\n"
	 			+ "\r\n"
	 			+ "   System.out.println(\"3. Display data\");\r\n"
	 			+ "\r\n"
	 			+ "   System.out.println(\"4. Save product list to file.\");\r\n"
	 			+ "\r\n"
	 			+ "   System.out.println(\"5. Search by ID\");\r\n"
	 			+ "\r\n"
	 			+ "   System.out.println(\"6. Delete by ID\");\r\n"
	 			+ "\r\n"
	 			+ "   System.out.println(\"7. Sort by ID.\");\r\n"
	 			+ "\r\n"
	 			+ "   System.out.println(\"8. Convert to Binary\");\r\n"
	 			+ "\r\n"
	 			+ "   System.out.println(\"9. Load to stack and display\");\r\n"
	 			+ "\r\n"
	 			+ "   System.out.println(\"10. Load to queue and display.\");\r\n"
	 			+ "\r\n"
	 			+ "   System.out.println(\"0. Exit\");");
	    
	    System.out.print("Your choice: ");
	}
	
}
