import java.io.*;

class question24_3
{
	public static void main(String[] args) throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("data.bin","r");
		raf.seek(raf.length()-8); // 맨 끝에서 8바이트 앞으로 이동
		System.out.println(raf.readDouble());
		raf.close();
	}
}