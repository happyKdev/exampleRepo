import java.util.HashMap;

class IntroHashMap
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hMap = new HashMap<Integer,String>();
		
		hMap.put(3,"나삼번");
		hMap.put(5,"윤오번");
		hMap.put(8,"박팔번");
		
		System.out.println("6학년 3반 8번 학생 : "+hMap.get(8));
		System.out.println("6학년 3반 5번 학생 : " +hMap.get(5));
		System.out.println("6학년 3반 3번 학생 : " +hMap.get(3));
		
		hMap.remove(5);
		
		System.out.println("6학년 3반 5번 학생 : " +hMap.get(5));
	}
}