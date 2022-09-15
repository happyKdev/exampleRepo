class question5_11
{
	public static void main(String[] args)
	{
		int num = 1,sum = 0;
		
		while(true)
		{
			if(num%2!=0)
			{
				sum+=num;
			}
			else
			{
				if(num%3==0)
				{
					sum+=num;
				}
			}
			if(sum>1000)
			{
				System.out.println(num+" 더할 때 1000을 넘는다.");
				System.out.println("초과된 값: " + sum);
				break;
			}
			num++;
		}
		
	}
}