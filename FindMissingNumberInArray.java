package TestQuestions;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,7,8};
		int num1=0;
		int num2=0;
		
		for(int i=0;i<nums.length-1;i++)
		{
		 num1=nums[i];
		 num2=num1+1;
			
		
		if(nums[i+1]!=num2)
		{
			System.out.println(" missed number is : " + num2);
			return;
		}

	   
		}
		
		System.out.println("No number is missed");

	}

}
