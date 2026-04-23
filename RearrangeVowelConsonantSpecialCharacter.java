package TestQuestions;

public class RearrangeVowelConsonantSpecialCharacter {

	public static void main(String[] args) {
		String str="Dilshad@#$$";
		
		char arr[]=str.toCharArray();
		
		StringBuilder vowel=new StringBuilder();
		StringBuilder consonant=new StringBuilder();
		StringBuilder specialChar=new StringBuilder();
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isAlphabetic(arr[i]))
			{
				if(arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
				{
					vowel.append(arr[i]);
				}
				else
				{
					consonant.append(arr[i]);
				}
			}
			
			else
			{
				specialChar.append(arr[i]);
			}
		}
		
		String result=vowel.toString()+consonant.toString()+specialChar.toString();	
		System.out.println(result);

	}

}
