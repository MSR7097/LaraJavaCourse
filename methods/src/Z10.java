class Z10 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		test(++i + i);
		System.out.println("Hello World!"+i);
	}
	public static void test(int i)
	{
		System.out.println("from test :"+ i);
		++i;
		System.out.println("from test end :"+ i);
		
	}

}
