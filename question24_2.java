import java.io.*;

class question24_2
{
	public static void main(String[] args) throws IOException
	{
		FileWriter out = new FileWriter("printf.txt");
		PrintWriter bufOut = new PrintWriter(new BufferedWriter(out));
		
		bufOut.printf("제 나이는 %d살 입니다.",24);
		bufOut.println("");
		
		bufOut.println("저는 자바가 좋습니다.");
		bufOut.print("특히 I/O 부분에서 많은 매력을 느낍니다.");
		bufOut.close();
		
		String str;
		BufferedReader in = new BufferedReader(new FileReader("printf.txt"));
		
		while(true)
		{
			str=in.readLine();
			if(str==null)
				break;
			
			System.out.println(str);
		}
		in.close();
	}
}