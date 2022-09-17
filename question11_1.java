class question11_1
{
	public static void main(String[] args)
	{
		String str="ABCDEFGHIJKLMN";
		StringBuilder sbuf= new StringBuilder(str);
		sbuf.reverse();
		str=sbuf.toString();
		System.out.println(str);
	}
}