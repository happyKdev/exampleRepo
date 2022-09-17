class Point
{
	int xPos,yPos;
	
	public Point(int x, int y)
	{
		xPos=x;
		yPos=y;
		
	}
	public void showPointInfo(){System.out.println("["+xPos+", "+yPos+"]");}
}

class Circle
{
	int rad; //반지름
	Point center; // 원의 중심
	
	public Circle(int x, int y, int r)
	{
		center = new Point (x,y);
		rad=r;
	}
	public void showCircleInfo()
	{
		System.out.println("radius : "+rad);
		center.showPointInfo();
	}
}

class Ring
{
	Circle innerCircle;
	Circle outCircle;
	
	public Ring(int inX, int inY, int inR, int outX, int outY, int outR)
	{
		innerCircle=new Circle(inX,inY,inR);
		outCircle=new Circle(outX,outY,outR);
	}
	public void showRingInfo()
	{
		System.out.println("Inner Circle Info...");
		innerCircle.showCircleInfo();
		System.out.println("Outter Circle Info...");
		outCircle.showCircleInfo();
	}
}

class question9_2
{
	public static void main(String[] args)
	{
		Ring c= new Ring(1,1,4,2,2,9);
		c.showRingInfo();
	}
}