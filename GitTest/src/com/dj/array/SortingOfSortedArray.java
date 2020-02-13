package com.dj.array;

import java.util.Arrays;

/**
 * Given a sorted array of integers ranging from negative to positive integers,
 * the output should have sorted array of square value of each element.
 * 
 * N is the length of an given array and i is the value of each element
 * in the array.
 * 
 * 1000 <= N > 0
 * 1 <= i > -10000
 * 
 * @author djenamani
 *
 */
public class SortingOfSortedArray {

	static int[] sortAndSquareRoot(int[] intArr)
	{
		int[] aoutArr = new int[intArr.length];
		
		for (int i = 0; i < intArr.length; i++)
		{
			aoutArr[i] = intArr[i] * intArr[i];
		}
		// Time complexity is [nlogN], so not a better solution
		Arrays.sort(aoutArr);
		
		return aoutArr;
	}
	
	/**
	 * Linear time complexity
	 * 
	 * @param intArr
	 * @return
	 */
	static int[] sortAndSquareRootInLinearTime(int[] intArr)
	{
		int[] aOutArr = new int[intArr.length];
		// Lets have 2 pointers pointing at start and end index of the array
		int left = 0;
		int right = intArr.length - 1;
		
		// loop through the array and add square root of the element to the array which is with greater value
		// and move pointer to next index.
		// [-4, -2, 3, 5] ==> [4, 9, 16, 25]
		for (int i = intArr.length - 1; i >= 0; i--)
		{
			if (Math.abs(intArr[left]) > Math.abs(intArr[right]))
			{
				aOutArr[i] = intArr[left] * intArr[left]; 
				left++;
			}
			else
			{
				aOutArr[i] = intArr[right] * intArr[right];
				right--;
			}
		}
		
		
		return aOutArr;
	}
	
	public static void main(String[] args) {
		int[] arrIn = {-99, -4, -2, 0, 3, 5};
		//int[] arrOut = sortAndSquareRoot(arrIn);
		int[] arrOut = sortAndSquareRootInLinearTime(arrIn);
		System.out.println(Arrays.toString(arrOut));
	}
	
	
	
	
}
