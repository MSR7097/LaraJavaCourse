class Z 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		test(i+20);
		System.out.println("main end ;"+i);
	}
	public static void test(int i)
	{
		System.out.println("from test"+i);
		i=30;
		System.out.println("from test"+i);
	}
}
