class K5         
{
	static int i;
	static K5 k5=new K5();
	static 
	{
		System.out.println("sib begin:"+i);
		k5.i=50;
		k5.i=60;
		
		System.out.println("sib end"+i);
	}
	public static void main(String[] args)
	{
		System.out.println("main: :"+i);
	}
	
	 
	
	
}


