package com.dj.array;

/**
 * Given the string, check if it is a palindrome.
 * Palindrome is the word or a phrase which reads same backward as forward.
 * 
 * @author djenamani
 *
 */
public class Palindrome {

	static boolean isPalindrome(String input)
	{
		char[] cs = input.toCharArray();
		char[] temp = cs;
		
		int j = 0;
		// traversal from last index of the string array
		for(int i = cs.length -1 ; i >= 0; i--)
		{
			// break the loop and return false if not matched
			if(temp[j] != cs[i])
			{
				return false;
			}
			j++;
		}
		return true;
	}
	
	static boolean isPalindrome2(String input)
	{
		return input.equals(new StringBuilder(input).reverse().toString());
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome2("abcdcba"));
	}
}
