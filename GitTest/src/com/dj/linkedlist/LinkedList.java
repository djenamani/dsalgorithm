package com.dj.linkedlist;

/**
 * Elements are stored in contiguous memory locations.
 * Maintains the insertion order.
 * Tail node is always Null means the linkedlist ends.
 * Head points to the first element of the list.
 * Insertion and deletion is faster than Arrays.
 * Varieties of linked lists are Singly LinkedList and Doubly linkedList.
 * Time complexity is O(n).
 * 
 * @author djenaman
 *
 */
public class LinkedList {

	// head node
	Node head;
	int size = 0;
	
	/**
	 * 
	 * 
	 * @param data to be added to the linkedlist
	 */
	public void add(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = new Node(data);
			size++;
			return;
		}
		
		Node tempNode = head;
		while(tempNode.next != null)
		{
			tempNode = tempNode.next;
		}
		tempNode.next = newNode;
		size++;
	}
	
	/**
	 * Prints all the elements inside the linkedlist object.
	 */
	public void show()
	{
		Node currentNode = head;
		if(currentNode == null)
		{
			return;
		}
		
		while(currentNode != null)
		{
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}		
	}
	
	/**
	 * Node class represents one block with data and pointer to the 
	 * next element.
	 * 
	 * @author djenaman
	 *
	 */
	class Node {
		
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
}
