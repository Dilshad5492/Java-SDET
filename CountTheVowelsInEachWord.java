package TestQuestions;

public class CountTheVowelsInEachWord {

	public static void main(String[] args) {
		
		
   String str="Mye name is Dilshad Ahmad";
   String words[]=str.split(" ");
   int count=0;
   for(String word: words)
   {
	   System.out.print(word + " : ");
	   for(char ch:word.toCharArray())
	   {
		   if("AEIOUaeiou".indexOf(ch)!=-1)
		   {
			   System.out.println(ch);
			   count++;
		   }
		   
		   
	   }
	   System.out.println(count);
	   count=0;
   }
   
	}

}
