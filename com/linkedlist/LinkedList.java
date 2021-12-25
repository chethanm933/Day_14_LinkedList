package com.linkedlist;

public class LinkedList {
	
	public static void main(String[] args) {
		
		INode<Integer> myFirstNode = new MyNode<Integer>(56);
		INode<Integer> mySecondNode = new MyNode<Integer>(30);
		INode<Integer> myThirdNode = new MyNode<Integer>(70);
		INode<Integer> myFourthNode = new MyNode<Integer>(56);
		INode<Integer> myFifthNode = new MyNode<Integer>(30);

		MyLinkedList<Integer> intLinkedList = new MyLinkedList<>();
		intLinkedList.add(myFirstNode);
		intLinkedList.add(mySecondNode);
		intLinkedList.add(myThirdNode);
		intLinkedList.add(myFourthNode);
		intLinkedList.add(myFifthNode);
		
		intLinkedList.printMyNodes();
		INode<Integer> poppeNode = intLinkedList.pop();
		System.out.println("Node"+poppeNode+"is popped out from the linked list");
		intLinkedList.printMyNodes();
	}
}

 