class question5_12
{
	public static void main(String[] args)
	{
		for(int i=1;i<10;i++)
		{
			//System.out.println(i + " % " + 2 + "=" + i%2 );
			if(i%2 == 0)
			{
				for(int j=1;j<10;j++)
				{
					if(j>i)
						break;
					System.out.println(i + " x " + j + " = " + i*j );
				}
			}

		}
	}
}