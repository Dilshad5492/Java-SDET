package TestQuestions;

public class SendZerosAtLast {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,1,2,0,3,0,0,0,1,0};
		int length=arr.length;
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[index++]=arr[i];

			}
		}
		
		while(index<length)
		{
			arr[index++]=0;
		}
		
		for(int i=0;i<index;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
