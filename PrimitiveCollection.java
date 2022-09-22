import java.util.Iterator;
import java.util.LinkedList;

class PrimitiveCollection
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext())
		{
			int num = itr.next();
			System.out.println(num);
		}
	}
}