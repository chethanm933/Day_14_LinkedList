package com.stackques;

public class StackList<K> {
	
	Node<K> head;
	
	public class Node<K> {
		K data;
		Node<K> next;

		Node(K data) {
			this.data = data;
		}
	}

	public boolean addLast(K data) {
		Node<K> newNode = new Node<K>(data);
		
		if (head == null) {
			head = newNode;
			return true;
		}

		Node<K> temp = head;
		while (temp.next != null) {

			temp = temp.next;
		}
			temp.next = newNode;
			return true;
	}

	public boolean addFirst(K data) {

		Node<K> newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return true;
		}

		Node<K> temp = head;
		newNode.next = temp;
		head = newNode;

		return true;
	}

	public boolean pop() {
		Node<K> temp = head;
		head = temp.next;
		return true;
	}

	public boolean popLast() {
		if (head == null)
			return false;
		if (head.next == null) {
			head = null;
			return true;
		}
			Node<K> temp = head;
			while (temp.next.next != null) {
			temp = temp.next;
		}
			temp.next = null;
			return false;
		}

		public void print() {
		if (head == null) {
			System.out.println("No elements to show...");
			return;
		}

		Node<K> temp = head;
		if (head.next == null) {
			System.out.println(head.data);
			return;
		}
			while (temp != null) {
			if (temp.next != null) {
				System.out.print(temp.data + " ===> ");
			} else {
				System.out.println(temp.data);
			}
			temp = temp.next;
		}
	}
	
}

