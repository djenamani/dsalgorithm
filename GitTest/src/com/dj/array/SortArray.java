package com.dj.array;

import java.util.Arrays;

/**
 * Sort an unsorted array of integers
 * 
 * @author djenaman
 *
 */
public class SortArray {

	static int[] sort(int[] inputArr)
	{
		int[] outArr = new int[inputArr.length];
		
		int len = inputArr.length;
		int left = 0;
		int right = len - 1;
		
		for(int i = len-1; i >= 0; i--)
		{
			if(Math.abs(inputArr[left]) > Math.abs(inputArr[right]))
			{
				outArr[i] = inputArr[left] * inputArr[left];
				left++;
			}
			else
			{
				outArr[i] = inputArr[right] * inputArr[right];
				right--;
			}
		}
		
		return outArr;
	}
	
	public static void main(String[] args) 
	{
		int[] resultArr = sort(new int[]{10, 1, 2 ,3, -7, -5, 5});
		System.out.println(Arrays.toString(resultArr));
	}
}
