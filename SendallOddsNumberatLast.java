package TestQuestions;

public class SendallOddsNumberatLast {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,3,1,4};
		int index=0;

		for(int num:nums)
		{
			
			if(num%2==0)
			{
			nums[index++]=num;
			}
		
		}
		
      	for(int num:nums)
		{
			
			if(num%2!=0)
			{
			nums[index++]=num;
			}
			
		}
		//For printing 
		for(int i=0;i<index;i++)
		{
		System.out.println(nums[i]);
		}

	}

}
