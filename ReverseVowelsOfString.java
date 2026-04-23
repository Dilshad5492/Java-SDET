package TestQuestions;

public class ReverseVowelsOfString {

	public static void main(String[] args) {
		String str="IceCreAm";
		char arr[]=str.toCharArray();

        StringBuilder vowels=new StringBuilder();

        for(char ch:arr)
        {
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            vowels.append(ch);

        }
        }
        String Vowel=vowels.reverse().toString();
        System.out.println(Vowel);
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
        	 if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'||arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
             {
                 arr[i]=Vowel.charAt(index++);

             }
        }
        
        String result=new String(arr,0,arr.length);
        System.out.println(result);
        
        }

	}


