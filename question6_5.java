class question6_5
{
	public static void main(String[] args)
	{
		int num = 4;
		int result = getPowerOfTwo(4);
		System.out.println("2의 " + num +"제곱은 " + result);
	}
	public static int getPowerOfTwo(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return 2 * getPowerOfTwo(n-1);		
	}
}