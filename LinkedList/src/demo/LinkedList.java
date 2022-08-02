package demo;

public class LinkedList<T> {

	public class Node{
		T data;
		Node next;
		Node(T data){
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	
	public void add(T data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node tempNode = head;
			while(tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
	}
	
	public T get(int index) {
		T data = null;
		if(head == null) {
			return null;
		}else if(index < 0){
			throw new IndexOutOfBoundsException("Out of bound");
		}else{
			Node tempNode = head;
			for(int i = 0; i < index && tempNode != null; i++) {
				tempNode = tempNode.next;
			}
			if(tempNode == null) {
				throw new IndexOutOfBoundsException("Out of bound");
			}else {
				data = tempNode.data;
			}
		}
		return data;
	}
	
	public void remove(int index) {
		if(head == null) {
			throw new IndexOutOfBoundsException("Out of bound");
		}else if(index < 0){
			throw new IndexOutOfBoundsException("Out of bound");
		}else{
			Node tempNode = head;
			for(int i = 0; i < index-1 && tempNode != null; i++) {
				tempNode = tempNode.next;
			}
			if(tempNode == null) {
				throw new IndexOutOfBoundsException("Out of bound");
			}else {
				tempNode.next = tempNode.next.next;
			}
		}
	}
	
	public void set(int index, T data) {
		if(head == null) {
			throw new IndexOutOfBoundsException("Out of bound");
		}else if(index < 0){
			throw new IndexOutOfBoundsException("Out of bound");
		}else{
			Node tempNode = head;
			for(int i = 0; i < index && tempNode != null; i++) {
				tempNode = tempNode.next;
			}
			if(tempNode == null) {
				throw new IndexOutOfBoundsException("Out of bound");
			}else {
				tempNode.data = data;
			}
		}
	}
	
	public int length() {
		int count = 1;
		if(head == null) {
			return 0;
		}else {
			Node tempNode = head;
			while(tempNode.next != null) {
				tempNode = tempNode.next;
				count++;
			}
		}
		return count;
	}
	
	public void display() {
		Node tempNode = head;
		while(tempNode.next != null) {
			System.out.print(tempNode.data);
			tempNode = tempNode.next;
		}
		System.out.print(tempNode.data);
	}
}
