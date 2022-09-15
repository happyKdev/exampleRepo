class question6_2
{
	public static void main(String[] args)
	{
		int a = 3, b= 7;
		absoluteValue(a,b);
		System.out.println();
	}
	public static void absoluteValue(int f,int s)
	{
		int result = 0;
		
		result = f-s;
		
		if(result<0)
		{
			result = -result;
		}
		System.out.println(f + " 그리고 " + s + " 두 수의 차의 절대값은 " + result + "입니다." );
	}
}