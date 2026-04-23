package TestQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesCharacter {

	public static void main(String[] args) {
	
		String str="Dilshad Ahmad";
		char arr[]=str.toCharArray();
		
		Set<Character> set=new HashSet<>();
		int index=0;
		for(char ch:arr)
		{
			if(set.add(ch))
			{
				arr[index++]=ch;
			}
		}
		
		String result =new String(arr,0,index);
		System.out.println(result);

	}

}
