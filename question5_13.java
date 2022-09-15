class question5_13
{
	public static void main(String[] args)
	{
		
		
		for(int A=0;A<10;A++)
		{
			
			for(int B=0;B<10;B++)
			{
				
				if(((A*10+B) + (B*10+A)) == 99)
				{
					System.out.println("A :" + A +", B :" + B);
				}
				
			}
		}
		
		
	}
}