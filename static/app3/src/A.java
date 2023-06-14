class A
{
	
	static
	{
		//System.out.println(i);
		//System.out.println(j);
		i=10;
		j=20;
		
	}

	static int i=9;
	static int j=8;

	static void test()
	{
		System.out.println(i);
		System.out.println(j);
		
	}
	public static void main(String[] args) 
	{
		test();
		System.out.println("done"+j+i);
	}
}
