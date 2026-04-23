package TestQuestions;

import java.util.HashMap;
import java.util.Map;

public class DelTest {

	public static void main(String[] args) {
		
		
		String str="Dilshad Ahmad";
		String str1=str.toLowerCase();
		
		char arr[]=str1.toCharArray();
		
		
		Map<Character,Integer> count =new HashMap<>();
		
		
		for(char Ch:arr)
		{
			
			count.put(Ch, count.getOrDefault(Ch,0)+1);
			
			
		}
		
		for(Map.Entry<Character,Integer> entry:count.entrySet())
			
		{
			
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
		
    
	}

}
