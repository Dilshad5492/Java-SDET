package TestQuestions;

import java.util.*;

public class SecondMaxima {

	public static void main(String[] args) {
		int nums[]= {1,2,3,1,2,4,5,2};
		
		TreeSet<Integer> unique=new TreeSet<>(Collections.reverseOrder());
		int index=0;
		for(int num:nums)
		{
			unique.add(num);
		}
		
		System.out.println(unique);
		
		Integer[] UA=unique.toArray(new Integer[1]);
	System.out.println(UA[0]);

	}

}
