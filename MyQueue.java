package Lab5;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;
import com.google.java.contract.ThrowEnsures;


@Invariant("size >= 0 && lastIndex != null")
public class MyQueue<E>{
	int front, rear;
	int size;
	int capacity;
	E[] array;

	public MyQueue(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = (E[]) new Object[this.capacity];
	}

// size capacity tentseh uyd queue duurne
	boolean isFull(MyQueue queue) {
		return (queue.size == queue.capacity);
	}

// size 0 uyd queue hooson bna
	
	@Ensures("size==0")
	boolean isEmpty(MyQueue queue) {
		return (queue.size == 0);
	}

// daraalald utga oruulah
	

	@Requires("Queue != null")
	@Ensures("size = size + 1 && element.leght = element.leght + 1")
	void enqueue(E item) {
		if (isFull(this))
			return;
		this.rear = (this.rear + 1) % this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item + " enqueued to queue");
	}

// daraallaas utga gargah
	
	@Ensures("element.leght = element.leght - 1")
	int dequeue() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		int item = (int) this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		assert  size != 0 : "Queue хоосон биш байх ёстой";
		return item;
		
	}

// daraalliin hamgiin urd taliin utgiig awah
	
	@Requires("Queue != null")
	@Ensures("elements[firstIndex]")
	int front() {
		assert size != 0 : "Queue хоосон биш байх ёстой";
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return (int) this.array[this.front];
	}

// daraalliin hamgiin ard taliin utgiig awah
	
	@Requires("Queue != null")
	@Ensures("elements[lastIndex]")
	int rear() {
		assert size != 0 : "Queue хоосон биш байх ёстой";
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return (int) this.array[this.rear];
		
	}

}