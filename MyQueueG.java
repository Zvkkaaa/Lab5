package Lab5;

public class MyQueueG<T> {
	private static class Node<T> {
		private T data;
		private Node next;
		public Node(T data) {
			this.data = data;
		}
	}

	private Node head;
	private Node tail;
	private int size;
	
	public boolean isEmpty( ) {
		return head == null;
	}
	public void add(T data) {
		
		Node<T> node = new Node<T>(data);
		if(tail != null) {
			tail.next = node;
		}
		tail = node;
		if(head == null) {
			head = node;
		}
		size++;
		System.out.println(tail.data);
	}
	
	public T getHeadData() {
		return (T) head.data;
	}
	public T getTailData() {
		return (T) tail.data;
	}
	public T remove() {
		T data = (T) head.data;
		head = head.next;
		if(head==null) {
			tail = null;
		}
		size--;
		return data;
	}
	public int size() {
		return size;
	}
	
}
