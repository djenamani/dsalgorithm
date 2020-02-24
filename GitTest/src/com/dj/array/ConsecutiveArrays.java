package com.dj.array;

import java.util.Arrays;

/**
 * Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, 
 * each statue having an non-negative integer size. Since he likes to make things perfect, 
 * he wants to arrange them from smallest to largest so that each statue will be bigger 
 * than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. 
 * Help him figure out the minimum number of additional statues needed.

 * Example

 * For statues = [6, 2, 3, 8], the output should be
 *  makeArrayConsecutive2(statues) = 3.

 * Ratiorg needs statues of sizes 4, 5 and 7.
 * @author djenaman
 */
public class ConsecutiveArrays {

	static int makeArrayConsecutive2(int[] statues) {
	    // count the missing statues and return the counter
	    int counter = 0;
	    
	    //arrays are sorted
	    Arrays.sort(statues);
	    
	    for(int i = 0; i < statues.length-1; i++)
	    {
	    	//System.out.println("loop:"+statues[i]);
	    	// find the difference between two adjacent elements
	    	if((statues[i+1]-statues[i]) > 1)
	    	{
	    		counter += (statues[i+1]-statues[i])-1;
	    		//System.out.println(counter);
	    	}
	    }

	    return counter;
	}
	
	/**
	 * Beter approach
	 * 
	 * @param statues
	 * @return
	 */
	static int makeArrayConsecutive3(int[] statues) {
	    //arrays are sorted
	    Arrays.sort(statues);
	    int d = statues[statues.length - 1] - statues[0];
	    return (d+1) - statues.length;
	}
	
	public static void main(String[] args) {
		System.out.println(makeArrayConsecutive3(new int[] {5, 2, 3, 4}));
	}

}
