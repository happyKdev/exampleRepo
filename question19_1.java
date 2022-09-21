class Point
{
	int xPos,yPos;
	
	public Point(int x, int y)
	{
		xPos=x;
		yPos=y;
	}
	public void showPosition()
	{
		System.out.printf("[%d, %d]", xPos,yPos);
	}
	public boolean equals(Object obj)
	{
		Point cmp=(Point)obj;
		if(xPos==cmp.xPos && yPos==cmp.yPos)
			return true;
		else
			return false;
	}
}

class Rectangle
{
	Point upperLeft,lowerRight;
	
	public Rectangle(int x1,int y1,int x2, int y2)
	{
		upperLeft=new Point(x1,y1);
		lowerRight=new Point(x2,y2);
	}
	public void showPosition()
	{
		System.out.println("직사각형 위치정보...");
		System.out.print("좌 상단 : ");
		upperLeft.showPosition();
		System.out.println("");
		System.out.print("우 하단 : ");
		lowerRight.showPosition();
		System.out.println("\n");
	}
	
	public boolean equals(Object obj)
	{
		Rectangle cmp=(Rectangle)obj;
		if(upperLeft.equals(cmp.upperLeft) && lowerRight.equals(cmp.lowerRight))
			return true;
		else
			return false;
	}
}

class question19_1
{
	public static void main(String[] args)
	{
		Rectangle rec1=new Rectangle(1,2,8,9);
		Rectangle rec2=new Rectangle(2,3,5,5);
		Rectangle rec3=new Rectangle(1,2,8,9);
		
		rec1.showPosition();
		rec2.showPosition();
		rec3.showPosition();
		
		if(rec1.equals(rec2))
			System.out.println("rec1과 rec2의 위치 정보는 같다.");
		else
			System.out.println("rec1과 rec2의 위치 정보는 다르다.");
		
		if(rec1.equals(rec3))
			System.out.println("rec1과 rec3의 위치 정보는 같다.");
		else
			System.out.println("rec1과 rec3의 위치 정보는 다르다.");
	}
}