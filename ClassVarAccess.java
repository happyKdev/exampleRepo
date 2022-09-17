class AccessWay
{
	static int num=0;
	
	AccessWay()
	{
		incrCnt();
	}
	public void incrCnt()
	{
		System.out.println("num++");
		num++;
	}
	
}

class ClassVarAccess
{
	public static void main(String[] args)
	{
		AccessWay way = new AccessWay();
		way.num++;
		AccessWay.num++;
		System.out.println("num="+AccessWay.num);
	}
}