package com.linkedlist;

public class LinkedList {
	
	public static void main(String[] args) {
		
		INode<Integer> myFirstNode = new MyNode<Integer>(56);
		INode<Integer> mySecondNode = new MyNode<Integer>(30);
		INode<Integer> myThirdNode = new MyNode<Integer>(70);
	
		MyLinkedList<Integer> intLinkedList = new MyLinkedList<>();
		intLinkedList.add(myFirstNode);
		intLinkedList.add(mySecondNode);
		intLinkedList.add(myThirdNode);
	
		intLinkedList.printMyNodes();
		
		
		System.out.println(intLinkedList.search(40));
		
		INode<Integer> myFourthNode = new MyNode<Integer>(40);
		
		intLinkedList.insert(30, myFourthNode);
		
		intLinkedList.printMyNodes(); 
		
		
	}
}

 