class question11_2
{
	public static void main(String[] args)
	{
		String str = "990208-1012752";
		StringBuilder sbuf=new StringBuilder(str);
		
		for(int i=0; i<sbuf.length();i++)
		{
			if(sbuf.charAt(i)=='-')
			{
				sbuf.deleteCharAt(i);
				break;
			}
		}
		str=sbuf.toString();
		System.out.println(str);
		
		String str2 = "990208-1012752";
		StringBuilder sbuf2=new StringBuilder(str);
		int idx = sbuf2.lastIndexOf("-");
		if(idx!=-1)
			sbuf2.deleteCharAt(idx);
		
		str2=sbuf2.toString();
		System.out.println(str2);
	}
}