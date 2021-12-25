package com.linkedlist;

public class MyLinkedList<K> {

	INode<K> head;
	INode<K> tail;
	
	void add (INode<K> newNode)  {
		if(tail == null) {
			tail = newNode;
		} else {
			head.setNext(newNode); 
		}
		
		if(head == null) {
			head = newNode;
		} else {
 			 tail = newNode;
		}
	}
	
	 public void printMyNodes() {
		 System.out.println("my nodes :"+head);
	 }
} 
