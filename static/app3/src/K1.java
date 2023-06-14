class K1 
{
	static int j=test();

	static 
	{
		System.out.println(i=10);
	}

	static int test()
	{
		System.out.println("from test   "+i);
		return i;
	}

	static 
	{
		test();
	}

	static int i;	

	public static void main(String[] args) 
	{
		System.out.println("done"+i);
		System.out.println("done"+j);
	}
}
