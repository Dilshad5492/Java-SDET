package TestQuestions;

import java.util.Arrays;

public class ReverseSpecificString {

	public static void main(String[] args) {
		String str="My name is Dilshad Ahmad";
		String arr[]=str.split(" ");
		
		StringBuilder sb=new StringBuilder(arr[3]);
		String result=sb.reverse().toString();
		
		arr[3]=result;
		
		String final1=Arrays.toString(arr);
		System.out.println(final1);
		

	}

}
