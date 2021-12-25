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
	
	INode<K> pop() { 
		INode<K> tempNode = head;
		head = head.getNext();
//		tempNode.setNext(null);
		return tempNode;
		
	}
		
	 public void printMyNodes() {
		 System.out.println("my nodes :"+head);
	 }
} 
