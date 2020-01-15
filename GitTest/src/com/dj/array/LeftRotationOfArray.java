package com.dj.array;

import java.util.Arrays;
/**
 * Write a program to left rotate elements of an array for
 * a specified number of times.   
 * 
 * @author djenaman
 *
 */
public class LeftRotationOfArray {

	// left rotate the given array for a number of given times 
	// array.length = n, so traversal will be n-1
	// No need to resize the array, only shifting of elements by one place i.e arr[j] -> arr[j+1]
	// A temp variable should be used to store the first index value, temp = arr[0]
	// then shift the temp variable at the end of arr, i.e arr[n-1]
	
	static int[] leftRotateArray(int[] arr, int d)
	{
		// rotation 
		for(int i = 0; i < d; i++)
		{
			// store the first element at index '0' in a temp var
			int temp = arr[0];
			// traversal of the entire array
			for(int j = 0; j < arr.length - 1; j++)
			{
				arr[j] = arr[j+1];
				//System.out.println(Arrays.toString(arr));
			}
			// move the first element stored in temp, to last index of array
			arr[arr.length-1] = temp;
			//System.out.println(Arrays.toString(arr));
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// left rotate an array 2 times
		int[] arr = {1, 2, 3, 4, 5, 6, 7}; 
		// input > {1, 2, 3, 4, 5, 6, 7}
		// output > {3, 4, 5, 6, 7, 1, 2}
		arr = leftRotateArray(arr, 2);
		System.out.println(Arrays.toString(arr));
	}
}
