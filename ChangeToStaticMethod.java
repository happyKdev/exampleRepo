class SimpleMath //단순 계산 클래스
{
	public static final double PI=3.1415;
	public static double add(double n1, double n2){return n1+n2;}
	public static double min(double n1, double n2){return n1-n2;}
	public static double mul(double n1, double n2){return n1*n2;}
}

class AreaMath //넓이 계산 클래스
{
	public static double calCircleArea(double rad) 
	{ 
		SimpleMath sm=new SimpleMath();
		double result=sm.mul(rad, rad); 
		result=sm.mul(result, SimpleMath.PI); 
		return result; 
	} 
	 public static double calRectangleArea(double width, double height) 
	 { 
		 SimpleMath sm=new SimpleMath(); 
		 return sm.mul(width, height);
	 }
}

class PerimeterMath //둘레 계산 클래스
{
	public static double calCirclePeri(double rad)
	{
		SimpleMath sm = new SimpleMath();
		double result=sm.mul(rad,2);
		result=sm.mul(result,SimpleMath.PI);
		return result;
	}
	public static double calRectanglePeri(double width, double height)
	{
		SimpleMath sm=new SimpleMath();
		return sm.add(sm.mul(width,2), sm.mul(height,2));
	}
}

class ChangeToStaticMethod
{
	public static void main(String[] args)
	{
		 System.out.println("원의 넓이 : "+AreaMath.calCircleArea(2.4));
		 System.out.println("직사각형 둘레 : "+PerimeterMath.calRectanglePeri(2.0,4.0));
	}
}