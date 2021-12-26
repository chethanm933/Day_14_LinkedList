package com.linkedlist;

public class MyLinkedList<K> {

	INode<K> head;
	INode<K> tail;
	
	void add (INode<K> newNode)  {
		if(tail == null) {
			tail = newNode;
		} else {
			tail.setNext(newNode);
		}
		
		if(head == null) {
			head = newNode;
		} else { 
			tail = newNode;
		}
	}
	   
	INode<K> popLast() { 
		INode<K> tempNode = head;
		while(tempNode.getNext().getNext() != null) {
		tempNode = tempNode.getNext();
		}
		INode<K> lastNode = tempNode.getNext();
		tempNode.setNext(null);
		return lastNode;
	}
		
	public boolean search(K value) {
		INode<K> tempNode = head;
		while(tempNode != null) {
		if(tempNode.getKey().equals(value)){
			return true;
		}
		tempNode = tempNode.getNext();
		}
		return false;
	}
	
	
	
	
	 public void printMyNodes() {
		 System.out.println("my nodes :"+head);
	 }
} 
