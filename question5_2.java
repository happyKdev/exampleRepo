class question5_2
{
	public static void main(String[] args)
	{
		int num=120;
		
		if(num<0)
		{
			System.out.println("0 미만");
		}
		else if(0<= num && num < 100)
		{
			System.out.println("0이상 100미만");
		}
		else if(100 <= num && num < 200)
		{
			System.out.println("100 이상 200 미만");
		}
		else if( 200 <= num && num < 300)
		{
			System.out.println("200 이상 300 미만");
		}
		else if(300 <= num)
		{
			System.out.println("300 이상");
		}
			
	}
}