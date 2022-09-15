class question6_4
{
	public static void main(String[] args)
	{
		boolean isPrime;
		for(int j = 1; j<=100; j++)
		{
			isPrime = getIsPrime(j);
			if(isPrime)
			{
				System.out.println(j+"(은)는 소수입니다.");
			}
			else
			{
				System.out.println(j+"(은)는 소수가 아닙니다.");
			}
		}
		
		
	}
	public static boolean getIsPrime(int n)
	{
		if(n<2)
		{			
			return false;
		}
		for(int i=2; i<n; i++)
		{
			if(n%i ==0)
			{				
				return false;
			}
		}
		return true;
	}
}