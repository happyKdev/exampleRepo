class question5_7
{
	public static void main(String[] args)
	{
		int n = 1000,result = 0;
		while(n>1)
		{
			if((n%2 == 0) && (n%7 == 0))
			{
				result += n;
				System.out.println("2의 배수이면서, 7의 배수 : " + n);
			}
			System.out.println(n);
			
			n--;
		}
		System.out.println("결과 : " + result);
	}
}