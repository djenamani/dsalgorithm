package com.dj.array;

/**
 * Implementation of a dynamic array class which accepts generic data type.
 * 
 * @author djenaman
 *
 */
@SuppressWarnings("unchecked")
public class DynamicArray<T> {
	
	private int capacity;
	private int size;
	private T[] arr;
	
	public DynamicArray(){
		this(16);
	}
	
	public DynamicArray(int aInCapacity) {
		arr = (T[])new Object[aInCapacity];
	}
	
	/**
	 * Returns the size of the dynamic array which includes the
	 * empty or null elements in the array. 
	 * 
	 * @return size of the array
	 */
	public int size()
	{
		return size;
	}
}
