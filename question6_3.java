class question6_3
{
	public static void main(String[] args)
	{
		double radius = 7.0;
		double area = getCircleArea(radius);
		System.out.println("반지름 " + radius +"인 원의 넓이는 " + area +"입니다.");
	}
	public static double getCircleArea(double r)
	{
		double result = 3.14 * (r*r);
		return result;
	}
	
	
}