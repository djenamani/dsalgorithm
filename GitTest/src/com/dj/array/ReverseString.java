package com.dj.array;

import java.util.Scanner;

/**
 * Given a String, reverse the string contents.
 * 
 * @author djenaman
 *
 */
public class ReverseString {

	/**
	 * Returns a string in reverse order by iterating the 
	 * characters within a string from last index till first index
	 * of the input string.
	 * 
	 * @param input string variable
	 * @return reversed string
	 */
	static String reverse(String input)
	{
		char[] cs = input.toCharArray();
		StringBuffer buffer = new StringBuffer();
		
		for(int i=cs.length-1; i >= 0 ; i--)
		{
			buffer.append(cs[i]);
		}
		
		return buffer.toString();
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			String str = sc.next();
			System.out.println(reverse(str));
		}
	}
}
