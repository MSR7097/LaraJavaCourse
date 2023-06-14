class K 
{
	static int j=test();
	static int i;
	static 
	{
		System.out.println(i=9);
	}

	static int test()
	{
		System.out.println(j);
		return i;
	}

	static 
	{
		
		test();
		
	}
	

	public static void main(String[] args) 
	{
		System.out.println("done"+i+","+j);
	}
}
