package fib;

public class Fibonacci {
	public Fibonacci()
	{
		
	}
	public int[] run(int num){
		int[] nums = new int[num];
		nums[0]=1;
		nums[1]=2;
		for(int i=2; i<num;i++)
		{
			nums[i]=nums[i-1]+nums[i-2];
		}
		return nums;
		
	}

}
