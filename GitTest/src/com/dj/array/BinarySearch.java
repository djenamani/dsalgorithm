package com.dj.array;

/**
 * Given a sorted integer array find the element in array 
 * using binary search algorithm.
 * 
 * @author djenaman
 *
 */
public class BinarySearch {

	static int findElement(int[] arr, int n, int l, int r)
	{
		//1, 2, 3, 4, 5, 7, 8
		//r = r -1;
		while(l <= r)
		{
			int med = (l+r)/2;
			
			if(arr[med] == n)
				return med;
			// element in middle is less than the searched element
			// so narrow the search array
			else if(arr[med] < n)
			{
				l = med + 1;
			}
			else
			{
				r = med - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
		int l = 0;
		int r = arr.length - 1;
		int n = 12;
		int index = findElement(arr, n, l, r);
		if(index >= 0)
			System.out.println("The element "+n+ " is present in index: "+index);
		else
			System.out.println("The element "+n+ " is not present in the given array");
	}
}
