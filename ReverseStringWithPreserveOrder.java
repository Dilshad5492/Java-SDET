package TestQuestions;

public class ReverseStringWithPreserveOrder {

	public static void main(String[] args) {
		String str="My name is Dilshad Ahmad";
		
		String words[]=str.split(" ");
		StringBuilder result=new StringBuilder();
		
		for(String word:words)
		{
			StringBuilder sb=new StringBuilder(word);
			
			result.append(sb.reverse().append(" "));
		}
		System.out.println(result.toString());

	}

}
