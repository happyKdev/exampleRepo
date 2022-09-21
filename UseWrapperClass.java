class UseWrapperClass
{
	public static void showData(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args)
	{
		Integer intInst=new Integer(3);//자바에서 더이상 사용하지 않음
		//Integer intInst=3;
		showData(intInst);
		showData(new Integer(7));
	}
}