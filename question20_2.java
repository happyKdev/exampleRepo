import java.util.*;
import java.math.*;

class question20_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 1 입력 : ");
		String val1=sc.nextLine();
		
		System.out.print("실수 2 입력 : ");
		String val2=sc.nextLine();
		
		BigDecimal e1 = new BigDecimal(val1);
		BigDecimal e2 = new BigDecimal(val2);
		
		BigDecimal subResult=e1.subtract(e2);
		System.out.println("두 실수의 차에 대한 절대값 : "+ subResult.abs());
	}
}