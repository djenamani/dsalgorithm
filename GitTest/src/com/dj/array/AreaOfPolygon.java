package com.dj.array;

public class AreaOfPolygon {

	static int shapeArea(int n) {
	    // the formula for calculating the area of polygon is
	    // n**2 + (n-1)**2
	    // return 1 if n = 1
		return (n == 1) ? 1 : (int)Math.pow(n, 2) + (int)Math.pow(n-1, 2);
	}

	
	public static void main(String[] args) {
		int area = shapeArea(3);
		System.out.println(area);
	}
}
