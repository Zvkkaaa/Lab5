package Lab5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MyQueue queue = new MyQueue(1000);
		System.out.println("Хэдэн элемент оруулах вэ?");
		int n = scanner.nextInt();
		for(int i=1 ; i<=n ;i++) {
			queue.enqueue(scanner.nextInt());
		}
		boolean swtch = true;
		while (swtch) {
			System.out.println("\n1) Дарааллаас элемент хасах()\n" 
	    	 	+ "2) Дараалалд элемент нэмэх()\n"
	    	 	+ "3) Урд талын элемент()\n" 
	    	 	+ "4) Хойд талын элемент()\n" 
	    		+ "5) Дараалал дахь элементийн тоо()\n"
	    	 	+ "6) Дараалал дүүрэх элементийн тоо()\n");
	    	 switch (scanner.nextInt()) {
			 case 1:
			 System.out.println("\n" + queue.dequeue() + " Дарааллаас хасагдсан элемент\n");
			 break;
			 case 2:
			 queue.enqueue(scanner.nextInt());
			 System.out.println("\n" + queue.rear() + " Дараалалд нэмэгдсэн элемент\n");
			 break;
			 case 3:
			 System.out.println("Урд талын элемент: " + queue.front());
			 break;
			 case 4:
			 System.out.println("Хойд талын элемент: " + queue.rear());
			 case 5:
			 System.out.println("Дараалал дахь элементийн тоо :" + queue.size);
			 break;
			 case 6:
			 System.out.println("Дараалал дүүрэх элементийн утга:" + queue.capacity);
			 break;
			 }
		}
	}
}