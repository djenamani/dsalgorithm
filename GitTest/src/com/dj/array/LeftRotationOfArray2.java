package com.dj.array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotationOfArray2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-- > 0)
		{
			int n = in.nextInt();
			int d = in.nextInt();
			
			int[] arr = new int[n];
			// add the elements to the array provided in input  
			for(int i = 0; i < n; i++)
			{
				arr[i] = in.nextInt(); 
			}
			
			StringBuffer sb = new StringBuffer();
			// left rotate the first d elements
			for (int i = d;i < n; i++)
			{
				sb.append(arr[i] + " ");
			}
			
			for (int i = 0; i < d; i++)
			{
				sb.append(arr[i]+ " ");
			}
			
			System.out.println(sb);
		}
	}
}
