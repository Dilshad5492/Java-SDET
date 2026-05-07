package TestQuestions;


// Find the max sum possible for sub array of size 3 this type of problem called sliding window problems
public class SlidingWindow {

	public static void main(String[] args) {
		
		
		int nums[]= {-5,-7,3,2,1,4,0,8,-1,-2};
		
		int sum1=nums[0]+nums[1]+nums[2];
		int sum2=sum1;
		
		
		for(int i=2;i<nums.length;i++)
		{
			sum1=nums[i-2]+nums[i-1]+nums[i];
			
			if(sum1>sum2)
			{
			sum2=sum1;
			}	
		}
		System.out.println(sum2);

	}

}
