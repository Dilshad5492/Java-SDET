package TestQuestions;

import java.util.Collections;
import java.util.TreeSet;

public class CgiTest {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,3,5,8,9};
		
		TreeSet<Integer> unique=new TreeSet<>(Collections.reverseOrder());
		
		for(int num:nums)
		{
			unique.add(num);
		}
		
		
		Integer uniqueArray[]=unique.toArray(new Integer[0]);
		
		System.out.println("Second Maximum:  " + uniqueArray[1]);
		
		System.out.println("Printing the Array Without any Duplicates Entry");
		
		for(int arr: uniqueArray)
		{
			System.out.print(arr);
		}
		
       
		
	}

}
