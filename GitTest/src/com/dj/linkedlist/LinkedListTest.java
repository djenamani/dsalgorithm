package com.dj.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * JUnit test code for testing functionality of LinkedList.
 * 
 * @author djenaman
 *
 */
class LinkedListTest {

	@Test
	void testAddMethod() {
		LinkedList linkedList = new LinkedList();
		assertNull(linkedList.head); 
		linkedList.add(23);
		linkedList.add(25);
		linkedList.add(28);
		assertNotNull(linkedList.head);
		//System.out.println("Size of the List: "+linkedList.size);
		assertEquals(3, linkedList.size);
		linkedList.show();
	}

}
