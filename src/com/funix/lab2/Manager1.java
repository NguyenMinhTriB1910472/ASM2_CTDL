package com.funix.lab2;

import java.io.IOException;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Manager1 implements Comparator<Product>{
	static Scanner scanner = new Scanner(System.in);
	static Queue<Product> productQueue=new Queue<Product>();
	static Stack<Product> productStack =new Stack<Product>();
	static OperationToProduct operationToProduct=new OperationToProduct();
	static LinkedList<Product> linkedList=new LinkedList<Product>();
	static Product product=new Product();
	public static void main(String[] args) throws IOException {
		Product product2= operationToProduct.createProduct();
	    operationToProduct.printBinary(product2);
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
		    	operationToProduct.searchByCode(linkedList);
		        break;
		      case 6:
		  		operationToProduct.deleteById(linkedList);
			    break;
		      case 7:
			    operationToProduct.sort(linkedList);;
				break;
		      case 8:
		    	  //convert to binary
			    Product product2= operationToProduct.createProduct();
			    operationToProduct.printBinary(product2);
				break;
		      case 9:
		    	  System.out.println("Dữ liệu trong stack là : ");
		    	  operationToProduct.getAllItemsFromFile("D:\\\\hoctap\\\\CyberSoft\\\\CTDL_LAB2\\\\data.txt", productStack);
				break;
		      case 10:
		    	  System.out.println("Dữ liệu trong queue là : ");
		    	  operationToProduct.getAllItemsFromFile("D:\\\\hoctap\\\\CyberSoft\\\\CTDL_LAB2\\\\data.txt", productQueue);;
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

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
