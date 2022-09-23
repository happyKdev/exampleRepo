import java.io.File;

class ListFileDirectoryInfo
{
	public static void main(String[] args)
	{
		File myDir=new File("testFile");
		File[] list = myDir.listFiles();
		
		for(int i=0;i<list.length;i++)
		{
			System.out.print(list[i].getName());
			if(list[i].isDirectory())
				System.out.println("\t \t DIR");
			else
				System.out.println("\t \t FILE");
		}
	}
}