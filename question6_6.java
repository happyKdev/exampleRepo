class question6_6
{
	public static void main(String[] args)
	{
		getBinary(12);
	}
	public static int getBinary(int n)
	{
		if(n>0)
		{
			int bin;
			bin=n%2;
			n/=2;
			getBinary(n);
			System.out.println(bin);
		}
		return 0;
	}
	
}