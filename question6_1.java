class question6_1
{
	public static void main(String[] args)
	{
		int a = 1, b = 2;
		printOperation(a,b);
	}
	public static void printOperation(int f, int s)
	{
		System.out.println("덧셈 : " + f + " + " + s + " = " + (f+s));
		System.out.println("뺄셈 : " + f + " - " + s + " = " + (f-s));
		System.out.println("곱셈 : " + f + " x " + s + " = " + (f*s));
		System.out.println("나눗셈 : " + f + " / " + s + " = " + "몫 = " + (f/s) + " 나머지 =" + (f%s));
	}
}