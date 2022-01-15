package com.dj.sample;

public class BigOofn {

	// if n = 5 then O(n*n) = 25 times the loop will be executed
	// if second inner loop j = i then f(n) = n + (n-1) + (n-2) + (n-3) + (n-4) = 15 if n = 5
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
		{
			for (int j = i; j<5; j++)
			{
				System.out.println("i="+ i +" j="+j);
			}
		}
	}
}
