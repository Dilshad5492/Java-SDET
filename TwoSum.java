package TestQuestions;

public class TwoSum {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,6,7,8,9,0};
		int target =5;
		
		
		for(int i=0;i<nums.length; i++)
		{
			for(int j=i;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					System.out.println(nums[i] + " " + nums[j]);
				}
			}
		}

	}

}
