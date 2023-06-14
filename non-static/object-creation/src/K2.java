class K2         
{
	int i;
	static K2 k1=new K2();
	static  
	{
		
		System.out.println(k1.i);
	}
	public static void main(String [] args)
	{
		 
		System.out.println("main: "+k1.i);
	}
}
