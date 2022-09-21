import java.util.Scanner;
import java.util.Random;

class question20_3
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("최대 : ");
		int max = keyboard.nextInt();
		
		System.out.print("최소 : ");
		int min = keyboard.nextInt();
		
		Random rand=new Random();
		
		int randVal;
		for(int i=0;i<10;i++)
		{
			randVal=rand.nextInt(max-min+1);
			randVal+=min;
			System.out.println(randVal);
		}
	}
}