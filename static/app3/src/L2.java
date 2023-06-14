class L2 
{
	
	static int test()
	{
		return j=200;
	}

	static int i=test2();
	static int j=test2();

	static int test2()
	{
		return i=test();
	}


	public static void main(String[] args) 
	{
		System.out.println(i+" , "+j);
	}
}
