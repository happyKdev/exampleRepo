class BitShiftOp
{
	public static void main(String[] args)
	{
		System.out.println(2 << 1); //4 
		System.out.println(2 << 2); //8
		System.out.println(2 << 3); //16
		
		System.out.println(8 >> 1); //4
		System.out.println(8 >> 2); //2
		System.out.println(8 >> 3); //1
		
		System.out.println(-8 >> 1); //-4
		System.out.println(-8 >> 2); //-2
		System.out.println(-8 >> 3); //-1
		
		System.out.println(-8 >>> 1); //2147483644
	}
	
}