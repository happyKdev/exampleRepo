import java.io.*;

class MyInfo
{
	String info;
	public MyInfo(String info){this.info=info;}
	public String toString(){return info;}
	
}

class question24_1
{
	public static void main(String[] args) throws IOException
	{
		OutputStream out = new FileOutputStream("println.txt");
		PrintStream pntOut = new PrintStream(out);
		
		MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
		
		pntOut.println(" 제 소개를 하겠습니다.");
		pntOut.println(mInfo);
		pntOut.printf("나이 %d, 몸무게 %dkg입니다.",24,72);
		pntOut.close();
		
	}
	
}