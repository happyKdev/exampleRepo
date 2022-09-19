class Gun
{
	int bullet;
	
	public Gun(int bnum){bullet=bnum;}
	public void shut()
	{
		System.out.println("BBANG!");
		bullet--;
	}
	
}

class Police
{
	int handcuffs;
	Gun pistol;
	
	public Police(int bnum,int bcuff)
	{
		handcuffs=bcuff;
		if(bnum!=0)
			pistol= new Gun(bnum);
		else
			pistol=null;
	}
	public void putHandcuff()
	{
		System.out.println("SNAP!");
		handcuffs--;
	}
	public void shut()
	{
		if(pistol==null)
			System.out.println("Hut BBANG!");
		else
			pistol.shut();
	}
}
class HasComposite
{
	public static void main(String[] args)
	{
		Police haveGun= new Police(5,3);
		haveGun.shut();
		haveGun.putHandcuff();
		
		Police dontHaveGun = new Police(0,3);
		dontHaveGun.shut();
	}
}