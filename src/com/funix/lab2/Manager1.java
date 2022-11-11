package com.funix.lab2;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.asm1.main.Utils;

public class Manager1 {
	static Scanner scanner = new Scanner(System.in);
	static Queue<Product> productQueue=new Queue<Product>();
	static OperationToProduct operationToProduct=new OperationToProduct();

	public static void main(String[] args) throws IOException {
		Queue<Product> proudctQueue= new Queue<Product>();
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
		//Node currentNode= proudctQueue.getHeadNode();
		while (!proudctQueue.isEmpty()) {
			System.out.println(proudctQueue.pop());
			//proudctQueue.getHeadNode().getNextNode();
		}
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
		    	operationToProduct.getAllItemsFromFile("D:\\hoctap\\CyberSoft\\CTDL_LAB2\\data.txt", productQueue);
		        break;
		      case 2:
		    	arrr= Math.readFile("input.txt");
		        break;
		      case 3:
		    	arrr=Math.bubbleSort(arr);
		        break;
		      case 4:
		    	arrr=Math.selectionSort(arr);
		        break;
		      case 5:
		    	arrr=Math.insertionSort(arr);
		        break;
		      case 6:
		    	System.out.println("Mời nhập giá trị cần tìm giá trị lớn hơn : ");
		    	float index = scanner.nextFloat();
		    	boolean isRight =false;
		    	for (int i = 0; i < arr.length; i++) {
					if (index==arr[i]) {
						isRight=true;
						break;
					}
					
				}
		    	if (isRight==true) {
		    		int count1=0;
			    	for (int i = 0; i < arr.length; i++) {
						if(arr[i]==arrr[i]) count1++;
					}
			    	if(count1<arrr.length-1) {
			    		Math.search(arrr,index);
			    	}else {
						System.out.println("Mời bạn sắp xếp các phần tử trong mảng trước khi tìm kiếm: ");
						break;
					}
				}else if((isRight==true)){
					System.out.println("Không có giá trị bạn cần tìm trong mảng!");
					break;
				}
		    	
		    	
			    break;
		      case 7:
		    	System.out.println("Nhập số cần tìm : ");
		    	arrr=Math.selectionSort(arr);
		    	float value =scanner.nextFloat();
		    	float number=Math.binarySearch(arrr, 0, arrr.length-1, value);
			    float[] arrr1 = {number};
		    	System.out.println(arrr1[0]);
			    Math.writeFile1("output", arrr1);
		    	
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
